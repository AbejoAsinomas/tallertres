package com.alejomarquez.tallerdos.aplicacion;


import com.alejomarquez.tallerdos.dominio.Producto;
import com.alejomarquez.tallerdos.dominio.Mercado;
import com.alejomarquez.tallerdos.dominio.TipoProducto;

import java.util.List;

public class app {
    public static void main(String[] args) {
        Mercado mercado = new Mercado("Mi Supercargoes", 100);

        // Crear algunos productos
        Producto producto1 = new Producto(1, "Leche", 2.99, TipoProducto.ALIMENTOAM);
        Producto producto2 = new Producto(2, "Detergente", 5.49, TipoProducto.LIMPIEZAAM);
        Producto producto3 = new Producto(3, "Televisor", 399.99, TipoProducto.ELECTRONICOAM);

        // Agregar productos al mercado
        mercado.agregar(producto1);
        mercado.agregar(producto2);
        mercado.agregar(producto3);

        // Buscar un producto por nombre
        String nombreBuscado = "Leche";
        com.alejomarquez.tallerdos.dominio.Producto productoEncontrado = mercado.buscar(nombreBuscado);
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Calcular el total del inventario
        int totalInventario = mercado.calcularTotal();
        System.out.println("Total del inventario: $" + totalInventario);

        // Retirar un producto por nombre
        String nombreARetirar = "Leche";
        boolean productoRetirado = mercado.retirar(nombreARetirar);
        if (productoRetirado) {
            System.out.println("Producto retirado con éxito.");
        } else {
            System.out.println("Producto no encontrado o no se pudo retirar.");
        }

        // Buscar productos por tipo
        String tipoBuscado = TipoProducto.LIMPIEZAAM;
        List<Producto> productosPorTipo = mercado.buscarPorTipo(tipoBuscado);
        if (!productosPorTipo.isEmpty()) {
            System.out.println("Productos de tipo " + tipoBuscado + ":");
            for (Producto producto : productosPorTipo) {
                System.out.println("- " + producto.getNombre());
            }
        } else {
            System.out.println("No se encontraron productos de tipo " + tipoBuscado);
        }
    }
}

