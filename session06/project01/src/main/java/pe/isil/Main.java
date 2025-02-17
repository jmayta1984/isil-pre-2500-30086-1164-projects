package pe.isil;

public class Main {
    public static void main(String[] args) {
        /*
         * PI
         */
        System.out.println("El valor de PI es " + Math.PI);

        /*
         * Max
         */
        System.out.println("El número mayor es " + Math.max(14, 20));

        /*
         * Min
         */
        System.out.println("El número menor es " + Math.min(14, 20));

        /*
         * DecrementExact
         */
        System.out.println("El número anterior es " + Math.decrementExact(25));

        /*
         * IncrementExact
         */
        System.out.println("El número posterior es " + Math.incrementExact(25));

        /*
         * FloorDiv & FloorMod
         */
        System.out.println("El cociente es " + Math.floorDiv(-15, 4));

        System.out.println("El residuo es " + Math.floorMod(-15, 4));


        System.out.println("El cociente es " + -15 / 4);

        System.out.println("El residuo es " + -15 % 4);

        /*
         * Abs
         */
        System.out.println("El valor absoluto es " + Math.abs(-30));

        /*
         * Sqrt
         */
        System.out.println("La raíz cuadrada es " + Math.sqrt(26));
    }
}