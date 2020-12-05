package com.company.Ativ_3;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 */
public class PalavraCruzada {
  private static String[] letras10pt = new String[]{"Q", "Z"};
  private static String[] letras8pt  = new String[]{"J", "X"};
  private static String[] letras5pt  = new String[]{"K"};
  private static String[] letras4pt  = new String[]{"F", "H", "V", "W", "Y"};
  private static String[] letras3pt  = new String[]{"B", "C", "M", "P"};
  private static String[] letras2pt  = new String[]{"D", "G"};

  public static int jogar(String palavra) {
    String texto = Normalizer.normalize(palavra, Normalizer.Form.NFD).toUpperCase().replaceAll("[0-9]*", "");

    int pontos = 0;

    for (int i = 0; i < texto.length(); i++) {
      char letra = texto.charAt(i);

      if (Character.isLetter(letra)) {
        if (Arrays.stream(letras10pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 10;
        else if (Arrays.stream(letras8pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 8;
        else if (Arrays.stream(letras5pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 5;
        else if (Arrays.stream(letras4pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 4;
        else if (Arrays.stream(letras3pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 3;
        else if (Arrays.stream(letras2pt).anyMatch(s -> s.equals(String.valueOf(letra)))) pontos = pontos + 2;
        else pontos = pontos + 1;
      }
    }

    return pontos;
  }
}
