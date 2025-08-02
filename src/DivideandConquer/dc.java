package DivideandConquer;

import java.util.Scanner;

public class dc {

    public static int[] takingArray(int n){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findSumDC(int[] arr, int startIdx, int endIdx){
        if(startIdx == endIdx){
            return arr[startIdx];
        }

        int midIdx = (startIdx+endIdx)/2;
        return findSumDC(arr, startIdx, midIdx)+findSumDC(arr, midIdx+1, endIdx);
    }

    public static int countEven(int[] arr, int startIdx, int endIdx){
        if(startIdx == endIdx){
            if(arr[startIdx] % 2 == 0){
                return 1;
            }
            return 0;
        }
        int midIdx = (startIdx+endIdx)/2;
        return countEven(arr,startIdx,midIdx)+countEven(arr,midIdx+1,endIdx);

    }
    public static double findSqrt(double n, double lowerBound, double upperBound){
        if(upperBound-lowerBound < 0.000001){
            return upperBound;
        }
        double mid = (upperBound+lowerBound) / 2.;
        if(mid*mid < n){
            return findSqrt(n,mid,upperBound);
        }else {
            return findSqrt(n, lowerBound, mid);
        }
    }
    public static int findMax(int[] arr, int startIdx, int endIdx){
        if(startIdx == endIdx){
            return arr[startIdx];
        }
        int midIdx = (startIdx+endIdx)/2;
        if(findMax(arr,startIdx, midIdx) > findMax(arr, midIdx+1, endIdx)){
            return findMax(arr,startIdx, midIdx);
        }else {
            return findMax(arr,midIdx+1, endIdx);
        }
    }

    public static int findMaxSubArraySumUsingBruteForcing(int[] arr, int startIdx, int endIdx){
        int maximumSubArraySum = Integer.MIN_VALUE;
        startIdx = 0;
        endIdx = 0;

        for(int left=0; left < arr.length; left++){
            int runningWindowSum = 0;
            for (int right = left ;right<arr.length; right++){
                runningWindowSum += arr[right];
                if (runningWindowSum > maximumSubArraySum){
                    maximumSubArraySum = runningWindowSum;
                    startIdx = left;
                    endIdx  = right;
                }
            }
        }
        return maximumSubArraySum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();

        int[] arr = takingArray(n);
        int totalSum = findSumDC(arr, 0, n-1);
        int totalEvenCount = countEven(arr,0,n-1);
        double theSqrtIs = findSqrt(n,1,n);
        int findTheMax = findMax(arr,0,n-1);
        int bruteForceForMaximumSubarraySum = findMaxSubArraySumUsingBruteForcing(arr, 0,n-1);
        System.out.println("Total Sum of the array is: "+totalSum);
        System.out.println("Total even numbers are: "+totalEvenCount);
        System.out.println("The square root of "+n+" is :"+theSqrtIs);
        System.out.println("The Max number is : "+findTheMax);
        System.out.println("The Max number is : "+findTheMax);
        System.out.println("The Maximum subarray sum is through bruteforcing method: "+bruteForceForMaximumSubarraySum);


    }
}

