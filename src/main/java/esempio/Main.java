package esempio;

public class Main {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            SingletonThread s=new SingletonThread();
            s.setName("Thread "+ i);
            s.start();
        }
        
    }

}
