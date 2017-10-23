/*Practica 9 - Fumadores
Alumnos: Oscar Armando González Patiño, Efrain Emanuel Morin Miranda
Fecha: 19 de octubre de 2017*/
public class Principal{
    public static void main(String[] args){
        //creacion de la mesa, la cual sirve de enlace entre los fumadores y el agente
        Mesa me = new Mesa();

        //creacion de los fumadores, y cada uno contiene un ingrediente, y el agente
        //0 = papel, 1 = tabaco, 2 = cerillos;
        Fumador f1 = new Fumador(0, me);
        Fumador f2 = new Fumador(1, me);
        Fumador f3 = new Fumador(2, me);
        Agente ag = new Agente(me);

        System.out.println("Fumador creado con papel");
        System.out.println("Fumador creado con tabaco");
        System.out.println("Fumador creado con cerillos");
        
        //inicio de los hilos
        ag.start();
        f1.start();
        f2.start();
        f3.start();
        
    }
}