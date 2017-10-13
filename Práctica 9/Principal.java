public class Principal{
    public static void main (String args[]){
        Buffer b1 = new Buffer();
        Productor p = new Productor(b1);
        Consumidor c = new Consumidor(b1);
        c.start();
        p.start();
    }
}
