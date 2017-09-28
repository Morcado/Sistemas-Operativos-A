/*Clase Hilo 1 que busca la cantidad de veces que se encuentra a y b
en un arreglo con números aleatorios*/
class Hilo1 extends Thread{
    //declaración de variables :v
    private int a;
    private int b;
    private int cont1;
    private int cont2;
    private int []arr;
    
    //constructor de Hilo1
    public Hilo1(int a, int b, int []arr){
        this.a = a;
        this.b = b;
        this.arr = arr;
        this.cont1 = 0;
        this.cont2 = 0;
    }
    
    public void run(){
        //cuenta cuantas veces se encuentra a y b en el arreglo
        for(int i = 0; i < 10; i++){
            if(arr[i] == a){
                cont1++;
            }
            if(arr[i] == b){
                cont2++;
            }
        }
        //impresion de perímetro y área
        System.out.println("A se repite " + cont1 + " veces");
        System.out.println("B se repite " + cont2 + " veces");
    }
}
