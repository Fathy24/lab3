package Lab3;

import junit.framework.TestCase;
import org.junit.Test;

public class DigitalWatchTest extends TestCase {
    @Test
    public void test1(){
        DigitalWatch test1 = new DigitalWatch();
        assertEquals("Welcome!",test1.Activate());
    }
    @Test public void test2(){
        DigitalWatch test2 = new DigitalWatch();
        assertEquals("Watch is closed open first",test2.setTimer(82));
    }
    @Test public void test3(){
        DigitalWatch test3 = new DigitalWatch();
        assertEquals("Watch is Already off",test3.ShutDown());
    }
    @Test public void test4(){
        DigitalWatch test4 = new DigitalWatch();
        assertEquals("Welcome!",test4.Activate());
        assertEquals("Already turned on",test4.Activate());
    }
    @Test public void test5(){
        DigitalWatch test5 = new DigitalWatch();
        assertEquals("Welcome!",test5.Activate());
        assertEquals("Already turned on",test5.Activate());
        assertEquals("Turned off",test5.ShutDown());
    }
    @Test public void test6(){
        DigitalWatch test6 = new DigitalWatch();
        assertEquals("Welcome!",test6.Activate());
        assertEquals("Timer starts now",test6.setTimer(10));
    }
    @Test public void test7(){
        DigitalWatch test7 = new DigitalWatch();
        assertEquals("Welcome!",test7.Activate());
        assertEquals("Timer starts now",test7.setTimer(10));
        assertEquals("Turned off",test7.ShutDown());
    }
}