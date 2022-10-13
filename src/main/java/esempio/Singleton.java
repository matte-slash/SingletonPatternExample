package esempio;

public class Singleton {

    private Integer id;

    //Costruttore invisibile
    private Singleton(){
        id= Integer.valueOf(10);
    }

    private static class SingletonHelper{

        private static final Singleton instance=new Singleton();

    }

    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }

    public Integer getId() {
        return id;
    }
}
