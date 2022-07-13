package br.com.dio.desafio;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();

        }

    public String getNome() {
        return nome;
    }

    public void setNome(String vanessa) {
    }

    public Set<Conteudo> getConteudosInscritos() {
        Set<Conteudo> conteudosInscritos = this.conteudosInscritos;
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        Set<Conteudo> conteudosConluidos = this.conteudosConcluidos;
        return conteudosConcluidos;
    }
}

