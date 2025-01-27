package pe.isil;

public class Main {
    public static void main(String[] args) {
        // Creación de una instancia
        Employee employee = new Employee("Federico", "Prada", 3500, false);

        // Acceso a un atributo de clase
        // Se acceden mediante el nombre de la clase
        System.out.println(Employee.minSalary);

        // Acceso a un método de instancia
        // Se acceden mediante una instancia de la clase
        System.out.println(employee.getFirstName());

        System.out.println(employee.toString());

        Employee employee2 = new Employee("Ana",
                "Pacheco", 7000, true);

        Employee.minSalary = 1500;

        System.out.println("Salario mínimo de " + employee.getFirstName() + ": " + employee.minSalary);

        System.out.println("Salario mínimo de " + employee2.getFirstName() + ": " + employee.minSalary);

        employee.hasBonus();

        employee2.hasBonus();

    }
}