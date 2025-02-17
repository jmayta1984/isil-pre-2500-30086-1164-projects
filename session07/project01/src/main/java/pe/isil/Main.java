package pe.isil;

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello, ISIL";

        /*
         * length
         */
        int size = greeting.length();
        System.out.println(size);

        /*
         * charAt
         */
        System.out.println(greeting.charAt(size - 1));

        /*
         * compareTo
         */
        System.out.println(greeting.compareTo("Hello, ISIl"));

        /*
         * concat
         */
        System.out.println(greeting.concat(" Móviles"));
        
        /*
         * equals
         */
        System.out.println(greeting.equals("Hello, ISIL"));

        /*
         * indexOf
         */
        System.out.println(greeting.indexOf("ISIL"));

        /*
         * replace
         */
        System.out.println(greeting.replace('I', 'O'));

        System.out.println(greeting.replace("ello", "i"));

        
    }
}