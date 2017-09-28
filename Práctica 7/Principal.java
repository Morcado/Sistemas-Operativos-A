/*Ejercicio de hilos
Alumnos: González Patiño Oscar Armando, Robledo Briones Manuel Alejandro*/

class Principal{
    public static void main(String []args){
        Hilo h = new Hilo();
        
        System.out.println(h.getName());
        h.start();    

        if(h.isAlive()){
            System.out.println("Soy un hilo vivo");
        }
        else{
            System.out.println("Soy un hilo muerto");
        }
       
        h.yield();
        
        if(h.isAlive()){
            System.out.println("Soy un hilo vivo");
        }
        else{
            System.out.println("Soy un hilo muerto");
        }
        
        if(h.isAlive()){
            System.out.println("Soy un hilo vivo");
        }
        else{
            System.out.println("Soy un hilo muerto");
        }
    }
}
