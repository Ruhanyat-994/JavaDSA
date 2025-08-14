package GreedyAlgo;

import java.util.*;

public class FractionalKnapsack {
    static class Items{
        private String name;
        private double value;
        private double weight;

        Items(String name, double value, double weight){
            this.name = name;
            this.value = value;
            this.weight = weight;
        }
        double ratio(){
            return (value/weight);
        }

    }

    static class Selection{
        final Items items;
        final double fraction;
        final double weightTaken;
        final double valueTaken;

        Selection(Items items, double fraction, double weightTaken, double valueTaken) {
            this.items = items;
            this.fraction = fraction;
            this.weightTaken = weightTaken;
            this.valueTaken = valueTaken;
        }
    }

    static class Result{
        final List<Selection> picks;
        final double totalWeight;
        final double totalValue;

        Result(List<Selection> picks, double totalWeight, double totalValue){
            this.picks = picks;
            this.totalWeight = totalWeight;
            this.totalValue = totalValue;
        }
    }

    public static Result fillingKnapsack(List<Items> items, double capacity){
        items.sort(Comparator.comparing(Items::ratio).reversed());

        double remaining = capacity;
        List<Selection> picks = new ArrayList<>();

        for(Items it : items ){
            if(remaining <= 0) break;

            double takenWeight = Math.min(it.weight , remaining);
            double fraction = takenWeight / it.weight ;
            double takenValue = fraction * it.value;

            picks.add(new Selection(it, fraction, takenWeight, takenValue));
            remaining -= takenWeight;
        }
        double used = capacity - remaining;
        double totalValue = picks.stream().mapToDouble(s -> s.valueTaken).sum();
        return new Result(picks,used,totalValue);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Items: ");
        int number = scanner.nextInt();

        List<Items> items = new ArrayList<>();
        for (int i = 0; i<number; i++){
            System.out.println("Enter details from items "+(i+1)+" (name value weight):");
            String name = scanner.next();
            double value = scanner.nextDouble();
            double wight = scanner.nextDouble();
            items.add(new Items(name, value, wight));
        }

        System.out.print("Enter Knapsack Capacity(W): ");
        double weight = scanner.nextDouble();

        Result result = fillingKnapsack(new ArrayList<>(items), weight);
        System.out.println("\nSelection:");
        for (Selection selection : result.picks){
            System.out.printf(
                    "Take %s : fraction:%.5f, weightTaken:%.2f, valueTaken:%.2f%n",
                    selection.items.name , selection.fraction, selection.weightTaken, selection.valueTaken
                    );
        }
        System.out.printf("\nTotal weight Used = %.2f%n", result.totalWeight);
        System.out.printf("\nTotal value  = %.2f%n", result.totalValue);

    }

}
