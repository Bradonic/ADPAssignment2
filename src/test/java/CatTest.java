import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
public class CatTest
{
    Cat cat = new Cat("Meow", 2);
    Cat cat2 = new Cat("Snowball", 5);
    Dog dog = new Dog("Fluffy", 2);
    @Test
    public void objectEquality()
    {
        Class actual = cat.getClass();
        assertEquals(cat2.getClass(), actual);
    }

    @Test
    public void objectIdentity()
    {
        Cat actual = cat;
        assertSame(cat, actual);
    }

    @Test
    public void failingTest()
    {
        assertSame(dog, cat);
    }

    @Test(timeout = 1000)
    public void timeoutTest()
    {
        assertEquals(2, cat.getAge());
    }

    @Test
    @Ignore
    public void disablingTest()
    {
        int actual = cat.getAge();
        cat.setAge(3);
        assertSame(3, actual);
    }
}