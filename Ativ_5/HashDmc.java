package com.company.Ativ_5;

/**
 *
 */
public class HashDmc {
  private final String[] valores;
  private final int      tamanho;

  public HashDmc(int tamanho){
    this.tamanho = tamanho;

    this.valores = new String[tamanho];
  }

  public int hash(String chave){
    return (37 * chave.hashCode()) % tamanho;
  }

  public String get(String chave){
    return this.valores[hash(chave)];
  }

  public void put(String chave, String valor){
    this.valores[hash(chave)] = valor;
  }

  public void remove(String chave){
    this.valores[hash(chave)] = null;
  }

  public boolean contains(String chave){
    return this.valores[hash(chave)] != null;
  }

  public int size(){
    int quantidade = 0;
    for (String valor : this.valores) {
      if (valor != null) quantidade++;
    }

    return quantidade;
  }
}
