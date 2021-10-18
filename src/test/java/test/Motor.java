package test;


class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    
    public void cambiarRegistro(int rg){
        this.registro = rg;
    }
    
    public void asignarTipo(String tp){
        if (tp.equals("normal") || tp.equals("electrico")){
            this.tipo = tp;
        }
    }
}
