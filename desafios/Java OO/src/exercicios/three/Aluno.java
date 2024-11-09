package exercicios.three;

public class Aluno {
    // Atributos
    private String name;
    private double grade1;
    private double grade2;

    //Construtor
    public Aluno(String name, double grade1, double grade2){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    // Métodos
    //getters e setters
    public String getName(){return name;}
    public double getGrade1(){return grade1;}
    public double getGrade2(){return grade2;}
}
