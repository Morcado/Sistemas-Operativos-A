public class Mesa{
    //ing = ingredientes que hay, llena indica que la mesa está llena, fuman indica si hay alguien ufmando
    private int[] ing;
    private boolean llena;
    private boolean fuman;
    
    public Mesa(){
        llena = false;
        fuman = false;
        ing = new int[2];
    }

    //regresa si la mesa está llena
    public boolean estaLlena(){
        return llena;
    }

    //regresa si hay alguien fumando
    public boolean estaFumando(){
        return fuman;
    }

    //guarda los ingredientes en la mesa vacía
    public void guardaIngredientes(int i1, int i2){
        ing[0] = i1;
        ing[1] = i2;

        llena = true;
    }

    //regresa los ingredientes de la mesa llena
    public int[] regresaIngredientes(){
        return ing;
    }

    //acciona el fuamdno
    public void fumando(){
        fuman = true;
        llena = false;
    }

    //acciona el no fumando
    public void noFumando(){
        llena = false;
        fuman = false;
    }

    //imprime el ingrediente
    public String cualIngre(int ingre){
        String cad = new String();
        switch(ingre){
            case 0:
                cad = "papel";
                break;
            case 1:
                cad = "tabaco";
                break;
            case 2:
                cad = "cerillos";
                break; 
        }
        return cad;
    }
}