package com.mycomany.prydebertablas;

abstract class MultiplicacionTabla {
    
    public int numero;

    public MultiplicacionTabla(int numero) {
        this.numero = numero;
    }
    
    public abstract void mostrarTabla();
    
    public abstract double sumaTabla();
}
