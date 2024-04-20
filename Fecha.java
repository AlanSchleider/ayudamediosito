package com.mycompany.fecha.poo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
/**
    // calcular fecha corta, 0(1)
 **/
    public String fechaCorta(){
        return dia + "/" + mes + "/" + anio;

    }
/**
    //validar fecha, 0(1)
    **/
   public boolean validarFecha() {
    // Validación básica: días entre 1 y 31, meses entre 1 y 12, años positivos
    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1) {
        return false;
    }
/**
    // Validación meses, 0(1)
    **/
       if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        return false;
    }
/**
    // Validación febrero y años bisiestos, 0(1)
   **/
    if (mes == 2) {
        if (dia > 29) {
            return false;
        }
        if (dia == 29 && (anio % 4 != 0 || (anio % 100 == 0 && anio % 400 != 0))) {
            return false;
        }
    }

    return true;
}
//0(1)
    public String mesLetra() {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return nombresMeses[mes - 1];
    }
//0(1)
    public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + anio;
    }
}