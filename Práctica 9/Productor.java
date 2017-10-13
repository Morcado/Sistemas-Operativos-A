import java.util.Random;

public class Productor extends Thread{

    private Buffer buffercomp;
    public Productor(Buffer buffer){
        buffercomp = buffer;
    }

    public void run(){
        
        while(true){
        // Dormir un tiempo aleatori
            try{
                int t = new Random().nextInt(2000);
                this.sleep(t);
            }
            catch(Exception e){
                System.out.println(e);
            }
            int a = new Random().nextInt(15);
            buffercomp.introduceDato(a);
            // Generar número entero aleatorio 
            //para insertar en el buffer.
            // Invocar al método introduceDato
            // con el número aleatorio como 
            // parámetro
        
        }
    }
// Declaración de variables
}
