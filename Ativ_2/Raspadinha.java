package com.company.Ativ_2;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Raspadinha {

  public static void main(String[] args){
    Scanner c = new Scanner(System.in);
    List<Integer> raspadinha = new ArrayList<>();
    int valor = 0;

    for (int i = 0; i <= 5; i++) {
      System.out.println("Digite o valor " + i + 1 + " da raspadinha: ");
      int numero = c.nextInt();
      raspadinha.add(numero);

      if (Collections.frequency(raspadinha, numero) == 3) {
        valor = valor + numero;
      }
    }

    System.out.println("O valor a receber é: " + valor);
  }
}
