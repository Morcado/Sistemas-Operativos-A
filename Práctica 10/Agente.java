import java.util.Random;

public class Agente extends Thread{
    private Mesa mesa;
    private int ing1;
    private int ing2;

    //constructor
    public Agente(Mesa mesa){
        this.mesa = mesa;
    }

    public void run(){
        while(true){
            //si la mesa está vacía y nadie está fumando entonces crea los ingredientes
            if(!mesa.estaLlena() && !mesa.estaFumando()){

                //crea un ingrediente y crea el otro mientras no sea igual al anterior
                ing1 = new Random().nextInt(3);
                ing2 = new Random().nextInt(3);
                while(ing1 == ing2){
                    ing2 = new Random().nextInt(3);
                }

                System.out.println("El agente a creado los ingredientes: " + mesa.cualIngre(ing1) + ", " + mesa.cualIngre(ing2));
                //guarda los ingredientes en la mesa
                mesa.guardaIngredientes(ing1, ing2);
            }
            else{
                //duerme al agente 1000 segundos para esperar que algun fumador deje de fumar
                try{
                    this.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}