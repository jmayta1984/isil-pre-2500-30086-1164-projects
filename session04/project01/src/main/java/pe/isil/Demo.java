package pe.isil;

public class Demo {

    public static int sumNaturals(int number) {

        int sum = 0;

        for(int i = 1; i <= number; i++) {
            sum += i; // sum = sum + i
        }
        return sum;
    }
}
