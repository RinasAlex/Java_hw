package org.example._2024_01_18;

public class getFactorial {
    public static void main(String[] args) {
        int a = 4;
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println("Factorial " + a + " = " + result);



    }
}
