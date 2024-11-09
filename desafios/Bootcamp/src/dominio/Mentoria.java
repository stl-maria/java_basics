package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //############################ ATRIBUTOS ############################
    private LocalDate data; //classe em que podemos trabalhar com datas


    //############################# MÉTODOS #############################
    @Override
    public double calcularXP() {
        return XP_PADRAO+ 20d;
    }

    /* - construtor
    public Mentoria(String titulo, String descricao, LocalDate data){
        this. titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }
    */

    //getters e setters
    public LocalDate getData() {return data;}
    public void setData(LocalDate data) {this.data = data;}

    //toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
