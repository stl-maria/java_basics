package dominio;

//Todo Bootcamp terá conteudos
//Mentorias e cursos são conteudos
public abstract class Conteudo {
    //constante
    protected static final double XP_PADRAO = 10d;

    //############################ ATRIBUTOS ############################
    private String titulo;
    private String descricao;

    //############################# MÉTODOS #############################
    //método abstrato
    public abstract double calcularXP();

    //getters e setters
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

}
