package org.example._2024_01_17;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int S = (int) (0.5 * a * b);
        System.out.println(new String("Square = ") + S);
    }
}
