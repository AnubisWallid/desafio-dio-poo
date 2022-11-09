import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desenvolvedor;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Noções básicas sobre os fundamentos Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(
                "Curso Java Intermediário",
                "Estruturas de dados com Java",
                10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Primeira mentoria - ao vivo");
        mentoria1.setData(LocalDate.of(2023,12,1));

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("BootCamp Desenvolvimento Java Completo");
        bootcamp1.setDescricao("Curso intensivo de linguagem Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        teste("Wallid Santana",bootcamp1,1);
        System.out.println("- - - - - - - - -");
        teste("Barba Negra",bootcamp1,3);

    }
    public static void teste(String nome, Bootcamp bootcamp, int progresso){
        Desenvolvedor dev = new Desenvolvedor();
        dev.setNome(nome);
        dev.increverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos de "+ nome +": "+ dev.getConteudosInscritos());
        for (int i = 0; i < progresso; i++) {
            dev.progredir();
        }
        System.out.println("Conteudo Inscritos de "+ nome +": "+ dev.getConteudosInscritos());
        System.out.println("Conteudo Concluidos de "+ nome +": "+ dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }
}
