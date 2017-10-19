public class Mesa{
    private int[] ing;
    private boolean llena;
    private boolean fuman;
    
    public Mesa(){
        llena = false;
        fuman = false;
        ing = new int[2];
    }

    public boolean estaLlena(){
        if(llena){
            return true;
        }
        return false;
    }

    public boolean estaFumando(){
        if(fuman){
            return true;
        }
        return false;
    }
    
    public void guardaIngredientes(int i1, int i2){
        ing[0] = i1;
        ing[1] = i2;

        llena = true;
    }

    public int[] regresaIngredientes(){
        llena = false;
        return ing;
    }

    public void fumando(){
        fuman = true;
    }

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