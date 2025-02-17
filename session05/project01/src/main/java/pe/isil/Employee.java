package pe.isil;

public class Employee {
    /*
     * Atributos de instancia
     */

    private String firstName;
    private String lastName;
    private double salary;
    private boolean hasChildren;

    /*
     * Atributo de clase
     */

    public static double minSalary = 1050;

    /*
     * Constructor
     */

    public Employee(String firstName, String lastName, double salary, boolean hasChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    /*
     * Getters & setters
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    /*
     * Método de instancia
     */

    @Override
    public String toString() {
        return "{Fullname: " + firstName + " " + lastName + "}";
    }

    /*
     * Crear una método que imprima si un empleo debe recibir un bono. Los bonos aplican solo a los empleados que tienen hijos.
     */

     public void hasBonus() {
        if (hasChildren) {
            System.out.println(firstName  + " recibe bono.");
        } else {
            System.out.println(firstName  + " no recibe bono.");

        }
     }
}
