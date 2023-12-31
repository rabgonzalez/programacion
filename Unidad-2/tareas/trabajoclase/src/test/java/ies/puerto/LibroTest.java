package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibroTest{

    Libro libro1 = new Libro("Hola", "Yo", 2023);

    @Test
    public void LibroTestOK(){
        String resultado = libro1.imprimir();
        String resultadoOK = "Titulo: HolaAutor: YoAño Publicacion: 2023";
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setAnioPublicacionTestOK(){
        libro1.setAnioPublicacion(10);
        int resultado = libro1.getAnioPublicacion();
        int resultadoOK = 10;
        Assertions.assertEquals(resultadoOK, resultado, "mal");
    }

    @Test
    public void cambiarAutor(){
        libro1.setAutor("Tu");
        String resultado = libro1.getAutor();
        String resultadoOK = "Tu";
        Assertions.assertEquals(resultado, resultadoOK);
    }
}