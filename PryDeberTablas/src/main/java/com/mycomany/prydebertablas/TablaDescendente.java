package com.mycomany.prydebertablas;

class TablaDescendente extends MultiplicacionTabla{
    public TablaDescendente (int numero){
        super(numero);
    }
    
    @Override
    public void mostrarTabla(){
        System.out.println("Tabla para: " +numero+ " en orden descendente");
        for (int i = 10; i >= 1; i--){
        System.out.println(numero+ " x " + i + " = " + (numero*i));
        }
    }
    @Override
     public double sumaTabla(){
        double suma = 0;
        for (int i = 1; i <=10; i++){
            suma += numero * i;
        }
        return suma;
       }
    }
