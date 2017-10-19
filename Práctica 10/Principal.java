public class Principal{
    public static void main(String[] args) {
        Mesa me = new Mesa();

        //0 = papel, 1 = tabaco, 2 = cerillos;
        Fumador f1 = new Fumador(0, me);
        System.out.println("Fumador creado con papel");
        Fumador f2 = new Fumador(1, me);
        System.out.println("Fumador creado con tabaco");
        Fumador f3 = new Fumador(2, me);
        System.out.println("Fumador creado con cerillos");
        
        Agente ag = new Agente(me);
        ag.start();
        f1.start();
        f2.start();
        f3.start();
        
    }
}