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
            ingreMesa = mesa.regresaIngredientes();
            if(mesa.estaLlena()){
                System.out.println("El fumador con " + mesa.cualIngre(ing) + " va a intentar fumar");

                if(ing != ingreMesa[0] && ing != ingreMesa[1]){ 

                    int t = new Random().nextInt(500);

                    mesa.fumando();
                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " esta fumando");

                    try{
                        this.sleep(t);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }

                    mesa.noFumando();
                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " ha dejado de fumar");
                }
                else{
                    System.out.println("El fumador con " + mesa.cualIngre(ing) + " no pudo fumar porque le falta " + mesa.cualIngre(ingreMesa[0]) + " y " + mesa.cualIngre(ingreMesa[1]));
                }
            }
        }
    }
}