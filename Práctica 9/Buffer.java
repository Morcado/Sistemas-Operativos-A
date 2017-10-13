import java.util.Stack;

public class Buffer{
    private int cont;
    private Stack<Integer> pila;

    public Buffer(){
        cont = 0;
        pila = new Stack<Integer>();
        // Creación del arreglo (memoria compartida)
    }
    public void introduceDato(int dato){
        if(cont < 5){
            pila.push(dato);
            
            System.out.println("Se inserto el dato: " + dato + " en la posicion: " + cont);
            cont++;
        }
        else{
            System.out.println("Buffer lleno");
        }
        /* Si el buffer está lleno, esperar a que exista
        por lo menos un lugar en el buffer. 
        Imprimir que el buffer está lleno
        
        Insertar dato en el buffer
        
        Imprimir mensaje de inserción, la posición 
        donde se insertó y el dato*/
        
    }
    public void sacaDato(){
        if(!pila.empty()){
            int a = pila.pop();
            cont--;

            System.out.println("El dato sacado es: " + a + " en la posicion: " + cont);
            
        }
        else{
            System.out.println("Buffer vacio");
        }
        /*Si el buffer está vacío, esperar a que
        exista por lo menos un dato enel buffer.
        Imprimir que elbuffer está vacío
        
        Sacar dato del buffer
        
        Imprimir dato consumidoy la posición de 
        donde se sacó*/
        }
// Declaración de variables PRIVADAS
}
