package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jeves");
        miLista.add("Viernes");
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jeves");
        miSet.add("Viernes");
//        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        
        String elementoMapa = miMapa.get("Valor1");
        System.out.println("elemento = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
        

    }

    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        for (String string : coleccion) {
            System.out.println("string = " + string);
        }
        
    }

}
