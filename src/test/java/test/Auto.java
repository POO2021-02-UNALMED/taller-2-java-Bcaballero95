/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Auto {

    private String modelo;
    private int precio;
    private Asiento[] asientos;
    private String marca;
    private Motor motor;
    private int registro;
    private int cantidadCreados;

    public int cantidadAsientos() {
        int total = 0;
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                total++;
            }
        }
        return total;
    }

    public String verificarIntegridad() {
        boolean ok = false;
        if (motor.getRegistro() == this.registro) {
            for (Asiento asiento : asientos) {
                if (asiento.getRegistro() == this.registro) {
                    ok = true;
                } else {
                    ok = false;
                    break;
                }
            }
        }
        if (ok == false) {
            return "Las piezas no son originales";
        } else {
            return "Auto original";
        }
    }

}
