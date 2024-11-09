package exercicios.three;

public class Atleta {
    // Atributos
    private double height;
    private char gender;

    //Construtor
    public Atleta(double height, char gender){
        this.height = height;
        this.gender = gender;
    }

    // Métodos
    public double getHeight(){return height;}
    public char getGender(){return gender;}
}
