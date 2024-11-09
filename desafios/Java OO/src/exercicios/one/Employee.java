package exercicios.one;

public class Employee {
    // Atributos
    String name;
    double grossSalary; //salario bruto
    double tax;

    // Métodos
    public double netSalary(){ //salario liquido
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        double aux = (percentage / 100) * grossSalary;
        grossSalary += aux;
    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
