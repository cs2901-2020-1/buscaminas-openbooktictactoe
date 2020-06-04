class Tablero{
    //Atributos
    int tamano;
    long puntaje;
    //Metodos
    public void setTablero(int _tamano) {
        tamano = _tamano;
        Casilla tablero[][] = new Casilla [tamano][tamano];
    }
    public void reiniciarTablero() {
        setTablero(tamano);
    }
    public void cambiarEstado(int X, int Y){
        //tablero[X][Y].cambiarEstado();
    }
//    public generarMinas(int X, int Y){
//        tablero[X][Y]
//    }
}
