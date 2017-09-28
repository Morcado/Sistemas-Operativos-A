/*Fecha: 25 de septiembre de 2017
Alumnos: Oscar Armando González Patiño, Manuel Alejandro Robledo Briones*/

import java.util.*;

class Principal{
    
    public static void main(String[] args){
        //matriz bidimensional A, B Y REWS 
        int [][]A;
        int [][]B;
        int [][]REWS; 
        
        //arreglos auxiliares que guardan las filas y columnas de los arreglos A y B
        int []c;
        int []f;   
        
        //tamaño de las matrices
        int n;
        
        //arreglo de hilos que ejecutan cada resultado parcial
        Hilo [][]h;
        
        Scanner scan = new Scanner(System.in);
        Boolean b = true;
        
        
        //validacion de datos de n
        do{
            System.out.print("Dame el tamaño de la matriz: ");
            n = scan.nextInt();
            
            if(n < 2 || n > 5){
                System.out.println("Error: número no válido. Ingrese un número entre 2 y 5.");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            else{
                
                b = false;
            }
        }while(b);
        
        h = new Hilo[n][n];
        A = new int[n][n];
        B = new int[n][n];
        REWS = new int[n][n];
        c = new int[n];
        f = new int[n];
        
        //ingresa los numeros para llenar el arreglo A
        b = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                do{
                    System.out.print("Introduce el elemento de la matriz A [" + i + "][" + j + "]: ");
                    A[i][j] = scan.nextInt();
                    if(A[i][j] < 0 || A[i][j] > 9){
                        System.out.println("Error: número no válido. Ingrese un número entre el 0 y 9");
                    }
                    else{
                        b = true;
                    }
                }while(!b);
                b = false;
            }   
        }
       
        //ingresa los numeros para llenar el arreglo B
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                do{
                    System.out.print("Introduce el elemento de la matriz B [" + i + "][" + j + "]: ");
                    B[i][j] = scan.nextInt();
                    if(B[i][j] < 0 || B[i][j] > 9){
                        System.out.println("Error: número no válido. Ingrese un número entre el 0 y 9");
                    }
                    else{
                        b = true;
                    }
                }while(!b);
                b = false;
            }
        }
        //ciclos para recorrer la matriz resultado y crear cada hilo que los van a resolver
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //ciclos para sacar cada arreglo de las matrices que se multiplcan
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < n; l++){
                        //saca cada arreglo y lo guarda en f y c
                        
                        if(k == i){
                            f[l] = A[k][l];
                        }
                        if(l == j){
                            c[k] = B[k][l];
                        }
                    } 
                }
                
                //crea cada objeto hilo con los datos
                h[i][j] = new Hilo(f, c, n);
                //inicia cada hilo
                h[i][j].start();

                //espera a que cada hilo se termine para continuar con el siguiente
                try{
                    h[i][j].join();
                   
                }
                catch(Exception e){
                    System.out.println(e);
                }
                //guarda el resultado en la matriz resultado
                REWS[i][j] = h[i][j].regresa();
            }
        }
        //imprime matriz A
        System.out.println("Matriz A");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
        //imprime matriz B
        System.out.println("Matriz B");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }

        //imprime la matriz resultado
        System.out.println("Matriz resultado");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(REWS[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
