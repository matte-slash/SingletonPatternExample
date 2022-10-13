package esempio;

public class SingletonThread extends Thread{

    private Singleton s;

    @Override
    public void run() {
         s=Singleton.getInstance();
    }
}
