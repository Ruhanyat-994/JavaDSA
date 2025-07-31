

# Recursion Problems in Java

This document contains solutions to several recursion-based problems implemented in Java. The questions are listed below, followed by their corresponding code implementations from the `Main.java` class.


## 1. Find minimum from an array using recursion

**Description**: Given an array, find the minimum element using recursion.

**Code**:
```java
public static int findMin(int[] arr, int index) {
    if (index == arr.length - 1) {
        return arr[index];
    }
    int minInRest = findMin(arr, index + 1);
    return Math.min(arr[index], minInRest);
}

```

## 2. Find 1^5 + 2^5 + ⋯ + n^5 using an array

**Description**: Calculate the sum of the fifth powers of all integers from 1 to n using recursion.

**Code**:

```java
public static int sumPower(int n) {
    if (n == 1) {
        return (int) Math.pow(1, 5);
    }
    return (int) Math.pow(n, 5) + sumPower(n - 1);
}
```

---

## 3. Check if a string is palindrome or not using recursion

**Description**: Determine if a given string is a palindrome using recursion.

**Code**:

```java
public static boolean isPalaindrom(String str, int start, int end){
    if(start >= end){
        return true;
    }
    if(str.charAt(start) != str.charAt(end)){
        return false;
    }
    return isPalaindrom(str, start + 1, end - 1);
}
```

---

## 4. Combination using recursion

**Description**: Compute nCr (combination of n and r) using recursion.

**Code**:

```java
public static int nCr(int n, int r){
    if(r == 0 || r == n){
        return 1;
    }
    return nCr(n - 1, r - 1) + nCr(n - 1, r);
}
```

---

## 5. Exponentiation using recursion

**Description**: Compute b^e (b raised to the power e) using simple recursion.

**Code**:

```java
public static int exponentiation(int b, int e){
    if(e == 0){
        return 1;
    }
    return b * exponentiation(b, e - 1);
}
```

---

## 6. Fast Exponentiation using recursion

**Description**: Compute b^e using fast exponentiation (divide and conquer approach) with recursion.

**Code**:

```java
public static int fastExponentiation(int b, int e){
    if(e == 0){
        return 1;
    }
    int prod = fastExponentiation(b, e / 2);
    if (e % 2 == 0){
        return prod * prod;
    } else {
        return b * prod * prod;
    }
}
```

---

## Additional Function: Factorial using recursion

**Description**: Compute the factorial of a number recursively.

**Code**:

```java
public static int factorial(int n){
    if(n == 0){
        return 1;
    }
    return n * factorial(n - 1);
}
```

---

## Additional Function: Fibonacci using recursion

**Description**: Compute the nth Fibonacci number using recursion.

**Code**:

```java
public static int fibonacci(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```
## Main Function is:
```java
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print factorial");
        int input = scanner.nextInt();
//        int factorial = factorial(input);
//        System.out.println(factorial);
        Main.sumPower(input);

        int[] arr = {34,15,88,2,45,67,9};
        int min = findMin(arr, 0);  // Start the recursion from the first index
        System.out.println("The minimum value in the array is: " + min);
        String str = "madam";
        boolean isPalindrome = isPalaindrom(str, 0, str.length() - 1);
        System.out.println(isPalindrome);

        int n = 45;
        int r = 5;

        System.out.println(n + "C" + r + " = " + nCr(n, r));
        System.out.println(fibonacci(n));

    }
```



