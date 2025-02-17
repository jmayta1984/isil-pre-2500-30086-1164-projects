package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int number = scanner.nextInt();

        int result = Demo.sumNaturals(number);

        System.out.println("El resultado es: " + result);
        scanner.close();
    }
}