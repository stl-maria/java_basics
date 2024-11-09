import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //criando cursos
        Curso cursoUm = new Curso();
        cursoUm.setTitulo("java");
        cursoUm.setDescricao("curso de java poo");
        cursoUm.setCargaHoraria(8);

        Curso cursoDois = new Curso();
        cursoDois.setTitulo("js");
        cursoDois.setDescricao("curso de javascript");
        cursoDois.setCargaHoraria(4);

        //System.out.println(cursoUm);
        //System.out.println(cursoDois);

        //criando mentorias
        Mentoria mentoriaUm = new Mentoria();
        mentoriaUm.setTitulo("mentoria de java");
        mentoriaUm.setDescricao("descricao mentoria java");
        mentoriaUm.setData(LocalDate.now()); //LocalData.now() -> data que foi criada

        //System.out.println(mentoriaUm);

        //criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrisao("Descrisao bootcamp java developer");
        bootcamp.getConteudos().add(cursoUm); //adicionando o curso Um no bootcamp
        bootcamp.getConteudos().add(cursoDois); //adicionando o curso Dois no bootcamp
        bootcamp.getConteudos().add(mentoriaUm); //adicionando a mentoria Um no bootcamp

        //criando Devs
        Dev devCamila = new Dev();
        System.out.println(" - - - - - - - ");
        devCamila.setNome("Camila");
        System.out.println("# Dev Camila #");
        devCamila.inscreverBootcamp(bootcamp); //adicionando Camila no bootcamp
        System.out.println("- Conteudos inscritos:\n"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("- Conteudos inscritos depois de progredir:\n"+devCamila.getConteudosInscritos());
        System.out.println("- Conteudos concluidos:\n"+devCamila.getConteudosConcluidos());
        System.out.println("- XP: "+devCamila.calcularTotalXP());

        System.out.println(" - - - - - - - ");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println("# Dev João #");
        devJoao.inscreverBootcamp(bootcamp); //adicionando Joao no bootcamp
        System.out.println("- Conteudos inscritos:\n"+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("- Conteudos inscritos depois de progredir:\n"+devJoao.getConteudosInscritos());
        System.out.println("- Conteudo concluido:\n"+devJoao.getConteudosConcluidos());
        System.out.println("- XP: "+devJoao.calcularTotalXP());
    }
}