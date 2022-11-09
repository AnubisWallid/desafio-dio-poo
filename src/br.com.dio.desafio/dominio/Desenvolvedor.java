package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
      return this.conteudosConcluidos
              .stream()
              .mapToDouble(Conteudo::calcularXp)
              .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desenvolvedor)) return false;

        Desenvolvedor that = (Desenvolvedor) o;

        if (getNome() != null ? !getNome().equals(that.getNome()) : that.getNome() != null) return false;
        if (getConteudosInscritos() != null ? !getConteudosInscritos().equals(that.getConteudosInscritos()) : that.getConteudosInscritos() != null)
            return false;
        return getConteudosConcluidos() != null ? getConteudosConcluidos().equals(that.getConteudosConcluidos()) : that.getConteudosConcluidos() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getConteudosInscritos() != null ? getConteudosInscritos().hashCode() : 0);
        result = 31 * result + (getConteudosConcluidos() != null ? getConteudosConcluidos().hashCode() : 0);
        return result;
    }
}
