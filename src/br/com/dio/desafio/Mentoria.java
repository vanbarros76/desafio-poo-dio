package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private String titulo;
    private String descricao;
    private LocalDate data;

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public Mentoria(){

    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


    public void setTitulo(String mentoria_de_java) {
    }

    public void setDescricao(String descrição_mentoria_java) {
    }
}
