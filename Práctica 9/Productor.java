import java.util.Random;

public class Productor extends Thread
{
    private Buffer buffercomp;
    public Productor(Buffer buffer)
    {
        buffercomp = buffer;
    }
    public void run()
    {
        for( ; ; )
        {
        // Dormir un tiempo aleatori
        try{
            this.sleep(new Random().nextInt(4000)+1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        buffercomp
        // Generar número entero aleatorio 
        //para insertar en el buffer.
        // Invocar al método introduceDato
        // con el número aleatorio como 
        // parámetro
        
        }
    }
// Declaración de variables
}
