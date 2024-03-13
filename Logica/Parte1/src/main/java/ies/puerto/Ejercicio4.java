package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    
    public int contarPalabras(String texto){
        String regex = "([A-z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        int contador = 0;
        while(matcher.find()){
            contador++;
        }
        return contador;
    }
}