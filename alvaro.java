package com.cebem.transformatolotu.models;


/**
 * COPYRIGHT all rights reserved.
 * @author Alvaro Diaz Torres
 * @version 1.0
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class alvaro {
/*    @GetMapping("/girarTexto/{texto}")
    public static String invertirYVoltear(@PathVariable String texto) {
    String inversas ="ɐqɔpǝɟƃɥıɾʞlɯuodbɹsʇnʌʍxʎz";
    String rectas ="abcdefghijklmnopqrstuvwxyz";
    return texto;
}*/
    public static String voltear(String textoClaro) {
            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String inversas ="ɐqɔpǝɟƃɥıɾʞlɯuodbɹsʇnʌʍxʎz";
            textoClaro = textoClaro.toUpperCase();
            
            String result = "";
            for (int i = 0; i < textoClaro.toUpperCase().length(); i++) {
                char letraSeleccionada = textoClaro.charAt(i);
                int posicionLetra = letras.indexOf(letraSeleccionada);
                result += inversas.charAt(posicionLetra);
            }
            return result;
        }

    public static String invertir(String original){
        char[] partido = original.toCharArray();
        char aux;
        int i = 0;
	    int j = partido.length-1;
	    while(j>i){
	        aux = partido[i];
	        partido[i] = partido[j];
	        partido[j] = aux;
	        j--;
	        i++;
	    }
        //TODO: Método To String para el array(? y return partido.toString pero bien
        return Arrays.toString(partido);
    }

    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        frase = voltear(frase);
        System.out.println(invertir(frase));
        sc.close();
    }
}
