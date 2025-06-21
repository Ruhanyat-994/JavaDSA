package leetCode.problem_2894;

public class leetcode2894 {

        public static int differenceOfSums(int n, int m) {

            int x = n/m;
            int num2 = m*x*(x+1)/2;
            int num1 = n*(n+1)/2 - num2;

            return num1-num2;

    }

    public static void main(String[] args) {

        int diff = differenceOfSums(5,1);
        System.out.println(diff);
    }

}
