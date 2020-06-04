


class Casilla{
    public boolean visible = false;
    public boolean mina  = false;
    public Casilla(){
        visible = false;
        mina = false;
    }
    public void cambiarEstado(){
        visible = true;
    }
}