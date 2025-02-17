package pe.isil;

public class Student {

    // Atributos: características
    private String name;
    private int age;

    // Constructor: crea un objecto de la clase
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters & setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Métodos: acciones
    public void study() {
        System.out.println(name + " está estudiando.");
    }

    public void printAge() {
        System.out.println(name + " tiene " + age + " años.");
    }
}
