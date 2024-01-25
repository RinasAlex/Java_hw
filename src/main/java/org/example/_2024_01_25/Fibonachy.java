package org.example._2024_01_25;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonachy {
    public static void main(String[] args) {
        int[] array = new int[]{};
        System.out.println(Arrays.toString(getFibonachy(array)));
    }

    public static int[] getFibonachy(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int[] number = new int[n];

        for (int i = 2; i < n; i++) {
            number[i] = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = number[i];
        }

        return number;
    }
}
