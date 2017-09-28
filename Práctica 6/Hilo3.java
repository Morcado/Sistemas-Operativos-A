/*Clase Hilo3 que ordena el arreglo de números aleatorios de forma ascendente 
usando el método de burbuja*/
class Hilo3 extends Thread{
    //variables
    private int temp;
    private int []arr;
    
    //constructor de Hilo3
    public Hilo3(int []arr){
        this.arr = arr;
        this.temp = 0;
    }
    
    public void run(){
        //ordena los elementos por el método de burbuja de forma descendente
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //imprime el arreglo ordenado
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
