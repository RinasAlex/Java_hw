package org.example._2024_01_17;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int P = (int) (a + b + c + d);
        System.out.println(new String("Perimeter = ") + P);
    }
}
