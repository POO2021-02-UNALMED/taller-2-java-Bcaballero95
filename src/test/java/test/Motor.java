package test;


class Motor {
    private int numeroCilindros;
    private String tipo;
    private int registro;

    public int getRegistro() {
        return registro;
    }
    
    
    public void cambiarRegistro(int rg){
        this.registro = rg;
    }
    
    public void asignarTipo(String tp){
        if (tp.equals("normal") || tp.equals("electrico")){
            this.tipo = tp;
        }
    }
}
