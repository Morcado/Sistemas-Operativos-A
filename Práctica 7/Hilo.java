/*clase del hilo que solo incrementa 1*/
class Hilo extends Thread{
    private int a;
    private int i;
    public Hilo(){
        this.a = 0;
        this.i = 10;
    }
    
    public void incA(){
        a++;
    }
    
    public void run(){
        incA();
        System.out.println(a);
        
    }
}
