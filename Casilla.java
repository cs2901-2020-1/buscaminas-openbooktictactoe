
class Casilla{
    public boolean visible = false;
    public boolean mina  = false;
    public int posx;
    public int posy;

    public Casilla(int x,int y){

    }

    public void set_state(int x){
        if(x==1){
            visible = true;
        }
    }
    public void print_casilla(){

    }


}