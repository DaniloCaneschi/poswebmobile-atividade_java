package com.company.Ativ_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Frequentador {
  private List<Aluno> alunos = new ArrayList<>();

  public void adicionarAluno(Aluno aluno) throws Exception{
    if (aluno == null)
      throw new Exception("Aluno não foi informado");

    this.alunos.add(aluno);
  }

  public Aluno getAluno(String nomeAluno){
    for (Aluno aluno : this.alunos) {
      if (aluno.getNome().equals(nomeAluno))
        return aluno;
    }

    return null;
  }

  public void removerAluno(String nomeAluno) throws Exception{
    Aluno aluno = getAluno(nomeAluno);

    if (aluno == null)
      throw new Exception("Aluno não existe");

    this.alunos.remove(getAluno(nomeAluno));
  }
}
