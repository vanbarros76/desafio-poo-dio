import br.com.dio.desafio.*;
import br.com.dio.desafio.Mentoria;
import br.com.dio.desafio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vanessa" + devVanessa.getConteudosInscritos());
        devVanessa.progredir();
        devVanessa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vanessa" + devVanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vanessa" + devVanessa.getConteudosConcluidos());
        System.out.println("XP: " + devVanessa.calcularTotalXp());

        System.out.println("-----------");

        Dev devIsabella = new Dev();
        devIsabella.setNome("Isabella");
        devIsabella.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isabella" + devIsabella.getConteudosInscritos());
        devIsabella.progredir();
        devIsabella.progredir();
        devIsabella.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isabella" + devIsabella.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Isabella" + devIsabella.getConteudosConcluidos());
        System.out.println("XP: " + devIsabella.calcularTotalXp());


    }
}
