/*Clase Hilo 2 que encuentra el perímetro y 
el área de un cuadrado de dimensiones a * b*/
class Hilo2 extends Thread{
    //declaración de variables
    private int a;
    private int b;
    private int area;
    private int perimetro;
    
    //contructor de Hilo2
    public Hilo2(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //método de thread para iniciar el hilo
    public void run(){
        //calcula el área y el perímetro
        this.area = a * b;
        this.perimetro = 2 * a + 2 * b;
        System.out.println("Area: " + area + "\nPerimetro: " + perimetro);
    }
}
