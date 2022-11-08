import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Noções básicas sobre os fundamentos Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso("Curso Java Intermediário",
                "Estruturas de dados com Java",
                10);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Primeira mentoria - ao vivo");
        mentoria1.setData(LocalDate.of(2023,12,1));

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
