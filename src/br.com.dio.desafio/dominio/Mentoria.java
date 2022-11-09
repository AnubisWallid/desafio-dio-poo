package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import static br.com.dio.desafio.dominio.Bootcamp.dtf;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo,descricao);
        this.data = data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria{" +
                " titulo='" + getTitulo() + '\'' +
                ", descricao= '" + getDescricao() + '\'' +
                ", data= " + data.format(dtf) +
                "}";
    }
}
