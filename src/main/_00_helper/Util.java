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

    public static void printArrWindow(int[] arr, int start, int end){
        for(int i = start;i <= end;i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void printArr(int[][] arr){
        for (int[] thisArr : arr){
            for (int n : thisArr) {
                System.out.print(n+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
