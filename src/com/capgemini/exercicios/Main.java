package com.capgemini.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        int anoAtual = 0;
        int idade = 0;

        System.out.println("Digite o ano de nascimento: ");
        p1.setAnoNascimento(leitor.nextInt());

        System.out.println("Digite o ano atual: ");
        anoAtual = leitor.nextInt();

        idade = anoAtual - p1.getAnoNascimento();

        System.out.println("A idade é: " + idade);


    }
}
