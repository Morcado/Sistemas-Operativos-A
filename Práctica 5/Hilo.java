class Hilo extends Thread{
    int i;
    
    public Hilo(int i){
        this.i = i;
    }
    
    public void run(){
        while(true){ 
         System.out.println("Soy la bendicion: "+ i);
        }
    }
}

