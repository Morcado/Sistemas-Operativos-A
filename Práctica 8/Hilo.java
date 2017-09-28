class Hilo extends Thread{
    private int[] f = null;
    private int[] c = null;
    private int n;
    private int r;
    
    //constructor que recibe los arreglos y el tamaño de cada uno
    public Hilo(int ff[], int cc[], int n){
        this.f = ff;
        this.c = cc;
        this.n = n;
    }    
    
    //metodo que calcula el resultado de cada casilla de la matriz resultaado
    public void producto(){
        for(int i = 0; i < n; i++){
            this.r += this.f[i]*this.c[i];
        }
    }
    
    //metodo que regresa el valor de r para asignar a la matriz resultado
    public int regresa(){
        return this.r;
    }
    //meotodo que ejecuta cada uno
    public void run(){
        producto();
    }
}
