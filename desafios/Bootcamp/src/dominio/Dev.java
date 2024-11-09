package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //############################ ATRIBUTOS ############################

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //para que sejam salvos na mesma ordem
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();

    //############################# MÉTODOS #############################

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); //nos conteudos inscritos, vamos adicionar todos os conteudos do bootcamp
        bootcamp.getDevsInscritos().add(this); //adicionando Dev no Bootcamp
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream()
                .findFirst(); //na ordem que foi adicionado, ou seja, o primeiro conteudo que entrou será o primeiro a ser concluido
        //tirando dos conteudos inscritos para os conteudos concluidos
        if(conteudo.isPresent()) {  //se existe
            this.conteudosConcluidos.add(conteudo.get()); //colocando em conteudos concluidos
            this.conteudosInscritos.remove(conteudo.get()); //tirando de conteudos inscritos
        } else {
            System.err.println("Você não esta matriculado em nenhum conteudo.");
        }

    }
    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())//cada conteudo dos Concluidos, pegamos o XP
                .sum(); //somando eles
    }

    //getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Set<Conteudo> getConteudosInscritos() {return conteudosInscritos;}
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {this.conteudosInscritos = conteudosInscritos;}

    public Set<Conteudo> getConteudosConcluidos() {return conteudosConcluidos;}
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {this.conteudosConcluidos = conteudosConcluidos;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
