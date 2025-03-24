// write a java method that takes an array of integers and returns the sum of the array
// Example: [1, 2, 3, 4, 5] -> 15

public class MyAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}
