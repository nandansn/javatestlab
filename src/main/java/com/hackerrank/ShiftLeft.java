package main.java.com.hackerrank;

public class ShiftLeft {

    public static void main(String[] args) {
        ShiftLeft.shLeft(2, new int[] { 1, 2, 3, 4 });
    }

    public static void shLeft(int n, int arr[]) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; i < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[arr.length - 1] = temp;
            }

        }

        for (int i : arr) {
            println(i);
        }
    }

}
