package org.example._2024_01_25;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonachy {
    public static void main(String[] args) {
        int[] array = new int[]{};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(Arrays.toString(getFibonachy(n, array)));
    }

    public static int[] getFibonachy(int n, int[] array) {

        int[] massiv = new int[n];
        massiv[0] = 0;
        massiv[1] = 1;

        for (int i = 2; i < n; i++) {
            massiv[i] = massiv[i-1] + massiv[i-2];
        }


        return massiv;
    }
}
