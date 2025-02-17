package pe.isil;

public class Demo {

    /*
     * Ejercicio 1
     * Crear un método que retorne la suma de los primeros n números naturales
     */
    public static int naturalsSum(int n) {
        return n * (n+1) / 2;
    }

    /*
     * Ejercicio 2
     * Crear un método que reciba como parámetro un número entero, y retorne
     * verdadero si el número es par o falso si el número es impar
     */

     public static boolean isOdd(int number) {
        return (number % 2) == 0;
     }

    /*
     * Ejercicio 3
     * Crear un método que reciba dos números enteros y retorne el mayor de ellos
     */
    public static int maxNumber(int a, int b){
        return (a > b) ? a: b;
    }

    /*
     * Ejercicio 4
     * Crear un método que reciba como parámetro el día de la semana en número e
     * imprima el día en letras
     */

      
}
