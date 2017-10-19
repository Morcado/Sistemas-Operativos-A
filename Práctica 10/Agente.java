import java.util.Random;

public class Agente extends Thread{
    private Mesa me;
    private int ing1;
    private int ing2;

    public Agente(Mesa me){
        this.me = me;
    }

    public void run(){
        while(true){
            //si la mesa está vacía y nadie está fumando entonces crea los ingredientes
            if(!me.estaLlena()){

                //crea un ingrediente y crea el otro mientras no sea igual al anterior
                ing1 = new Random().nextInt(3);
                ing2 = new Random().nextInt(3);
                while(ing1 == ing2){
                    ing2 = new Random().nextInt(3);
                }

                System.out.print("El agente a creado los ingredientes: ");
                System.out.println(me.cualIngre(ing1) + ", " + me.cualIngre(ing2));
                
                //guarda los ingredientes en la mesa
                me.guardaIngredientes(ing1, ing2);
            }
        }
    }
}