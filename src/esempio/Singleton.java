package esempio;

public class Singleton {


    //Costruttore invisibile
    private Singleton(){
        System.out.println("Nuova istanza creata");
    }

    private static class SingletonHelper{

        private static final Singleton instance=new Singleton();

    }

    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }

}
