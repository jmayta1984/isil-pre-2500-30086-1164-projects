package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 40;
        System.out.println("Mi edad: " + age);

        int a = 15, b = 5;
        int result = a + b;
        System.out.println("La suma es: " + result);

        float pi = 3.14f;
        System.out.println("El valor de pi: " +  pi);

        Demo.greeting();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String name;
        name = scanner.nextLine();

        Demo.greeting(name);
        scanner.close();
    }
}