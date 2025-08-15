package GreedyAlgo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GreedyCoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominator = {1000, 500, 100, 50, 20, 10, 5, 2,1};
        System.out.print("Amount: ");
        int amount = scanner.nextInt();
        int totalCoins = 0;

        for (int i=0; i< denominator.length ;i++){

            if(denominator[i] <= amount){
                int count = amount / denominator[i];
                amount = amount%denominator[i] ;
                totalCoins += count;
            }
            if (amount == 0) break;
        }

        System.out.println("Total coins used: "+totalCoins);

    }

}
