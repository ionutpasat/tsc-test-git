// write a java method that takes an array of integers and returns the sum of the array
// Example: [1, 2, 3, 4, 5] -> 15

public class MyAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int multiplyArray(int[] arr) {
        int product = 1;
        for (int i : arr) {
            product *= i;
        }
        return product;
    }

    public static int subtractArray(int[] arr) {
        int difference = arr[0];
        for (int i = 1; i < arr.length; i++) {
            difference -= arr[i];
        }
        return difference;
    }
}
