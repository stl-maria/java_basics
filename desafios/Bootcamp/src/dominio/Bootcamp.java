package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    //############################ ATRIBUTOS ############################
    private String nome;
    private String descrisao;
    private final LocalDate dataInicial = LocalDate.now(); //data atual
    private final LocalDate dataFinal = dataInicial.plusDays(45); //+45 dias a partir da data inicial (atual)
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    //############################# MÉTODOS #############################
    //getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getDescrisao() {return descrisao;}
    public void setDescrisao(String descrisao) {this.descrisao = descrisao;}

    public LocalDate getDataInicial() {return dataInicial;}
    public LocalDate getDataFinal() {return dataFinal;}

    public Set<Dev> getDevsInscritos() {return devsInscritos;}
    public void setDevsInscritos(Set<Dev> devsInscritos) {this.devsInscritos = devsInscritos;}

    public Set<Conteudo> getConteudos() {return conteudos;}
    public void setConteudos(Set<Conteudo> conteudos) {this.conteudos = conteudos;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descrisao, bootcamp.descrisao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descrisao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
