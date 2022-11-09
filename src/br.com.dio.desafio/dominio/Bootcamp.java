package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nome;
    private String Descricao;
    private LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45L);
    private Set<Desenvolvedor> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Desenvolvedor> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Desenvolvedor> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (getNome() != null ? !getNome().equals(bootcamp.getNome()) : bootcamp.getNome() != null) return false;
        if (getDescricao() != null ? !getDescricao().equals(bootcamp.getDescricao()) : bootcamp.getDescricao() != null)
            return false;
        if (getDataInicial() != null ? !getDataInicial().equals(bootcamp.getDataInicial()) : bootcamp.getDataInicial() != null)
            return false;
        if (getDataFinal() != null ? !getDataFinal().equals(bootcamp.getDataFinal()) : bootcamp.getDataFinal() != null)
            return false;
        if (getDevsInscritos() != null ? !getDevsInscritos().equals(bootcamp.getDevsInscritos()) : bootcamp.getDevsInscritos() != null)
            return false;
        return getConteudos() != null ? getConteudos().equals(bootcamp.getConteudos()) : bootcamp.getConteudos() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getDescricao() != null ? getDescricao().hashCode() : 0);
        result = 31 * result + (getDataInicial() != null ? getDataInicial().hashCode() : 0);
        result = 31 * result + (getDataFinal() != null ? getDataFinal().hashCode() : 0);
        result = 31 * result + (getDevsInscritos() != null ? getDevsInscritos().hashCode() : 0);
        result = 31 * result + (getConteudos() != null ? getConteudos().hashCode() : 0);
        return result;
    }
}
