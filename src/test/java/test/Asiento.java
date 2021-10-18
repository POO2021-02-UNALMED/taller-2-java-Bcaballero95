/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


class Asiento {
    private String color;
    private int precio;
    private int registro;

    public int getRegistro() {
        return registro;
    }
    
    
    
    public void cambiarColor(String color){
        if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")){
            this.color = color;
        }
    }
}
