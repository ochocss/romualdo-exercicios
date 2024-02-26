package com.chocz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a coordenada X do primeiro ponto: ");
        int xA = scanner.nextInt();

        System.out.print("Insira a coordenada Y do primeiro ponto: ");
        int yA = scanner.nextInt();

        System.out.print("\nInsira a coordenada X do segundo ponto: ");
        int xB = scanner.nextInt();

        System.out.print("Insira a coordenada Y do segundo ponto: ");
        int yB = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));

        System.out.printf("\nDistância entre A(%d, %d) e B(%d, %d) = %f", xA, yA, xB, yB, distance);
    }
}
