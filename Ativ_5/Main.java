package com.company.Ativ_5;

/**
 *
 */
public class Main {
  public static void main(String[] args){
    HashDmc hash = new HashDmc(5);

    hash.put("A", "Danilo Caneschi");
    hash.put("B", "Jessica Lamarca");
    hash.put("C", "Carlos Jose");

    System.out.println("Add elemento chave A - Danilo Caneschi");
    System.out.println("Add elemento chave B - jessica Lamarca");
    System.out.println("Add elemento chave C - Carlos Jose");

    System.out.println("Total elementos: " + hash.size());

    System.out.println("Chave B: " + hash.get("B"));

    hash.remove("B");

    System.out.println("Removido chave B");

    System.out.println("Total elementos: " + hash.size());

    System.out.println("Tem elemento A: " + hash.contains("A"));
    System.out.println("Tem elemento B: " + hash.contains("B"));
    System.out.println("Tem elemento C: " + hash.contains("C"));
  }
}
