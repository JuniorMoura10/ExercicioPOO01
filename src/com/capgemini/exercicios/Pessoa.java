package com.capgemini.exercicios;

import java.util.Date;

public class Pessoa {

    private String nome;
    private int anoNascimento;
    private float altura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", altura=" + altura +
                '}';
    }
}
