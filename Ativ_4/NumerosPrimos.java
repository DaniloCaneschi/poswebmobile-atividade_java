package com.company.Ativ_4;

import java.util.Scanner;

/**
 *
 */
public class NumerosPrimos {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o tamanho da lista para verificar números primos:");
    int tamanhoarray = scanner.nextInt();

    boolean[] arrayPrimos = new boolean[tamanhoarray];

    for (int i = 1; i < arrayPrimos.length; i++) {
      arrayPrimos[i] = true;
    }

    arrayPrimos[0] = false;

    for (int i = 1; i < arrayPrimos.length; i++) {
      if (arrayPrimos[i]) marcarComoFalse(i + 1, arrayPrimos);
    }

    int qtdprimos = 0;
    for (boolean arrayPrimo : arrayPrimos) {
      if (arrayPrimo) qtdprimos++;
    }

    System.out.println("Números primos: " + qtdprimos);

  }

  private static void marcarComoFalse(int numero, boolean[] array){
    for (int i = numero; i < array.length; i++) {
      if (array[i]) {
        if ((i + 1) % numero == 0) array[i] = false;
      }
    }
  }
}
