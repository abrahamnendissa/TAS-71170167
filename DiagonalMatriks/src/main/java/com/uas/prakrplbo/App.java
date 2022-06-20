package com.uas.prakrplbo;

public class App {
    public static void main( String[] args ) {
        int [][]matriks = {
                {1,8,13,12},
                {14,11,2,7},
                {15,10,3,6},
        };

        int N=3;

        for (int s=0; s<N; s++) {
            for (int i=s; i>-1; i--) {
                System.out.print(matriks[i][s-i] + " ");
            }
            System.out.println();
        }

        for (int s=1; s<N; s++) {
            for (int i=N-1; i>=s; i--) {
                System.out.print(matriks[i][s+N-1-i] + " ");
            }
            System.out.println();
        }
    }
}
