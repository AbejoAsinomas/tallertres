package com.alejomarquez.tallerdos.dominio;

public class Producto {
    private int codigoAM;
    private String nombreAM;
    private double precioAM;
    private String tipoAM;




    public Producto(int codigo, String nombre, double precio, String tipo) {
        this.codigoAM = codigo;
        this.nombreAM = nombre;
        this.precioAM = precio;
        this.tipoAM = tipo;
    }

    public int getCodigo() {
        return codigoAM;
    }

    public String getNombre() {
        return nombreAM;
    }

    public double getPrecio() {
        return precioAM;
    }

    public String getTipo() {
        return tipoAM;
    }
}




