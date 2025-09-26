package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre +" "+apellido;
        String saludo = "Hola".concat(nombreCompleto);
        int edad = 20;
        String mensajeEdad = "Tengo " +edad +" años"; 
        
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombreCompleto);    
        System.out.println(saludo);    
        System.out.println(mensajeEdad);
    }
}
