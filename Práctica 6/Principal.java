/*Alumnos: Oscar Armando González Patiño, Manuel Alejandro Robledo Briones
Fecha: 19 de septiembre de 2017

Programa de hilos en java*/
import java.util.*;

/*clase principal*/
class Principal{
    public static void main(String[] args){
        
        //declaracion de variables
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int a, b;
        
        //introduccion de los datos
        System.out.print("Dame a: ");
        a = scan.nextInt();
        System.out.print("Dame b: ");
        b = scan.nextInt();
        
        //llenado y impresión del arreglo con números aleatorios
        for(int i = 0; i < 10; i++){
            arr[i] = new Random().nextInt(10);
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        
        //instancias de los 3 hilos
        Hilo1 h1 = new Hilo1(a, b, arr);
        Hilo2 h2 = new Hilo2(a, b);
        Hilo3 h3 = new Hilo3(arr);
        
        //corridas de los 3 hilos
        h1.start();
        h2.start();
        h3.start();
    }
}
