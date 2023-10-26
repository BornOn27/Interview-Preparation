package main._00_helper;

public class Util {
    public static void printArr(int[] arr){
        for (int n : arr) {
            System.out.print(n+", ");
        }
        System.out.println();
    }

    public static void printArrTillN(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
