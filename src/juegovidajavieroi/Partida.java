/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegovidajavieroi;

/**
 *
 * @author javier
 */
public class Partida {

    private Tablero tabl;
    private int numeroRep;

    public int getNumeroRep() {
        return numeroRep;
    }

    public void setNumeroRep(int numeroRep) {
        this.numeroRep = numeroRep;
    }

    public Partida(int dimension, int porcen) {
        this.tabl = new Tablero(dimension, porcen);
    }

    public void tipoGeneracion(int opcion) {
        if (opcion == 1) {
            this.tabl.asignarCelManual();
        } else {
            this.tabl.asignarCelAlt();
        }

    }

    public boolean comprobarRep(Tablero siguiente) {
        
        if (this.tabl.generacionIgual(siguiente.getTablero())) {
            this.numeroRep++;
            return true;
        }
        this.numeroRep =0;
        return false;
    }

    public void muestraGeneracion() {
        System.out.println("GENERACIÓN " + this.tabl.getNumGeneracion());
        this.tabl.mostrarTablero();
        System.out.println("");
    }

    public boolean crearGeneracion(int i) {
        if (i == 1) {
            muestraGeneracion();
            this.tabl.siguienteGeneracion();
            return true;
        }
        return false;
    }

    public Tablero getTabl() {
        return tabl;
    }

    public void setTabl(Tablero tabl) {
        this.tabl = tabl;
    }

}
