package com.example;
import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {

    final double PRECIO_PRODUCTO = 15.99;
    final int IVA_PORCENTAJE = 16;

    // Crear Scanner para capturar datos del usuario
    Scanner scanner = new Scanner(System.in);
    
    // Capturar nombre del cliente
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreDelCliente = scanner.nextLine();

    // Capturar cantidad de productos
    System.out.print("Ingrese la cantidad de productos: ");
    int cantidadDeProductos = scanner.nextInt();

    // Calcular subtotal, IVA y total
    double subtotal = PRECIO_PRODUCTO * cantidadDeProductos;
    double iva = subtotal * IVA_PORCENTAJE / 100;
    double total = subtotal + iva;
    
    // Imprimir factura completa
    System.out.println("\n===== FACTURA =====");
    System.out.println("Cliente: " + nombreDelCliente);
    System.out.println("Cantidad de productos: " + cantidadDeProductos);
    System.out.println("Precio unitario: $" + PRECIO_PRODUCTO);
    System.out.println("Subtotal: $" + subtotal);
    System.out.println("IVA (" + IVA_PORCENTAJE + "%): $" + iva);
    System.out.println("Total a pagar: $" + total);
    System.out.println("===================");

    // Cerrar Scanner
    scanner.close();
        }

    public static void main(String[] args) {
        ejercicio10();
    }
}




    
    




   


       
    

