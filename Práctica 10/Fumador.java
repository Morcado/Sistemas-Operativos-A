import java.util.Random;

public class Fumador extends Thread{
    private int ing;
    private int[] ingreMesa;
    private Mesa mesa;

    public Fumador(int ing, Mesa mesa){
        this.ing = ing;
        this.mesa = mesa;
    }

    public void run(){
        while(true){
            //recupera los ingredientes de la mesa para saber si va a fumar o no
            ingreMesa = mesa.regresaIngredientes();
            if(mesa.estaLlena()){
                System.out.println("El fumador con " + mesa.cualIngre(ing) + " va a intentar fumar");

                //si los ingredientes no son iguales al que tiene
                if(ing != ingreMesa[0] && ing != ingreMesa[1]){
                    //indica 
                    mesa.fumando();
                    int t = new Random().nextInt(500);

                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " esta fumando");

                    //fuma un tiempo determinado
                    try{
                        this.sleep(t);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    //deja de fumar indicando que nadie fuma
                    mesa.noFumando();
                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " ha dejado de fumar");
                    //System.out.println(mesa.estaLlena() + " " + mesa.estaFumando());
                }
                else{
                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " no pudo fumar porque le falta " 
                            + mesa.cualIngre(3 - ingreMesa[0] - ingreMesa[1]));
                }

            }
            try{
                this.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            //System.out.print(ing + " Mesa vacia ,");
            
        }
    }
}