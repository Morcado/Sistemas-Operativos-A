import java.util.Random;

public class Consumidor extends Thread{

    private Buffer buffercomp;
    public Consumidor(Buffer buffer){
        buffercomp = buffer;
    }
    
    public void run(){
        while(true){
            try{
                int t = new Random().nextInt(2000);
                this.sleep(t);
            }
            catch(Exception e){
                System.out.println(e);
            }
            buffercomp.sacaDato();
            // Dormir un tiempo aleatorio
            
            // Invocar al método sacaDato de la 
            // clase buffer
           
        }
    }
    // Declaración de variabl
   
}
