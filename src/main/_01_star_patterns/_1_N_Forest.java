package main._01_star_patterns;

public class _1_N_Forest {
    public static void main(String[] args) {
        nForest(4);
    }

    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
