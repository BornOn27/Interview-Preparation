package main._01_star_patterns;

public class _03_N_Triangle {
    //Question-Link :: https://www.codingninjas.com/studio/problems/n-triangles_6573689

    /*
        Pattern Type  ==>   1
                            1 2
                            1 2 3
     */
    public static void main(String[] args) {
        nTriangle(3);
    }

    public static void nTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
