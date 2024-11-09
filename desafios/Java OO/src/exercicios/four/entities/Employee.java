package exercicios.four.entities;

public class Employee {
    // ATRIBUTOS
    private Integer id;
    private String name;
    private Double salary;

    //Construtor
    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //importante??
    //public Employee(){};

    public Integer getId(){return id;}
    public String getName(){return name;}
    public Double getSalary(){return salary;}

    // MÉTODOS
    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }

    public void aumentoSalarial(double valor){
        salary += salary * valor /100;
    }
}
