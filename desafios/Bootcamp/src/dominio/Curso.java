package dominio;

public class Curso extends Conteudo{
    //############################ ATRIBUTOS ############################
    private int cargaHoraria;

    //############################# MÉTODOS #############################
    //método abstrato do Conteudo
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    /* - construtor
    //  para usar com construtor
    public Curso(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
    */

    //  para usar sem o construtor
    public Curso(){}

    //getters
    public int getCargaHoraria(){return cargaHoraria;}

    //setters
    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    //toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }



    //####################################################################

}
