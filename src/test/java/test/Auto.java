/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Auto {

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;

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
        if (motor.registro == this.registro) {
            for (Asiento asiento : asientos) {
                if (asiento.registro == this.registro) {
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
