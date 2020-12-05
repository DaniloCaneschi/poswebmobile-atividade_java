package com.company.Ativ_1;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Danilo");
        aluno.setEmail("danilo@gmail.com");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carla");
        aluno2.setEmail("carla@gmail.com");

        Frequentador frequentador = new Frequentador();
        try {
            frequentador.adicionarAluno(aluno);
            frequentador.adicionarAluno(aluno2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
