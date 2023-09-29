package com.alejomarquez.tallerdos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private String nombreSupermercadoAM;
    private List<Producto> listaProductosAM;
    private final int capacidadAM;

    public Mercado(String nombreSupermercado, int capacidad) {
        this.nombreSupermercadoAM = nombreSupermercado;
        this.listaProductosAM = new ArrayList<>();
        this.capacidadAM = capacidad;
    }

    public boolean agregar(Producto p) {
        if (listaProductosAM.size() >= capacidadAM) {
            return false;
        }

        for (Producto productoExistente : listaProductosAM) {
            if (productoExistente.getCodigo() == p.getCodigo()) {
                return false;
            }
        }

        listaProductosAM.add(p);
        return true;
    }

    public boolean retirar(String nombre) {
        for (Producto producto : listaProductosAM) {
            if (producto.getNombre().equals(nombre)) {
                listaProductosAM.remove(producto);
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String nombre) {
        for (Producto producto : listaProductosAM) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public Producto buscar(int codigo) {
        for (Producto producto : listaProductosAM) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> buscarPorTipo(String tipo) {
        List<Producto> productosPorTipo = new ArrayList<>();
        for (Producto producto : listaProductosAM) {
            if (producto.getTipo().equals(tipo)) {
                productosPorTipo.add(producto);
            }
        }
        return productosPorTipo;
    }

    public int calcularTotal() {
        int total = 0;
        for (Producto producto : listaProductosAM) {
            total += producto.getPrecio();
        }
        return total;
    }
}



