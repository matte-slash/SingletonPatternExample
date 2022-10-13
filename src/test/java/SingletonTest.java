import esempio.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleton(){
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        Assert.assertSame("Same Object", s1, s2);

    }

    @Test
    public void testID(){
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        Assert.assertSame("Same Object ID", s1.getId(), s2.getId());
    }

}
