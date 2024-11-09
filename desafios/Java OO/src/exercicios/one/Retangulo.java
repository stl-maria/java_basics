//class rectangle
package exercicios.one;

public class Retangulo {
    // Atributo
    double width; //largura
    double height; //altura

    // Métodos
    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }
}
