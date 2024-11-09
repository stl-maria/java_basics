package exercicios.one;

public class Student {
    // Atributos
    String name;
    double nota1, nota2, nota3;

    // Método
    public double pegaNotalFinal(){
        return nota1 + nota2 + nota3;
    }

    public double quantoFaltou(){
        if (pegaNotalFinal() < 60.0){
            return 60.0 - pegaNotalFinal();
        } else {
            return 0.0;
        }
    }
}
