package Lab3;

import junit.framework.TestCase;
import org.junit.Test;

public class CoffeeMachineTest extends TestCase {
    @Test
    public void test1() {
        CoffeeMachine test1 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test1.ActivateMachine());
    }
    @Test public void test2() {
        CoffeeMachine test2 = new CoffeeMachine();
        test2.Activity = true;
        assertEquals("Machine Already On", test2.ActivateMachine());
    }
    @Test public void test3() {
        CoffeeMachine test3 = new CoffeeMachine();
        assertEquals("Please turn the machine first", test3.pay(30));
    }
    @Test public void test4() {
        CoffeeMachine test4 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test4.ActivateMachine());
        assertEquals("money received", test4.pay(30));
    }
    @Test public void test5() {
        CoffeeMachine test5 = new CoffeeMachine();
        test5.ActivateMachine();
        assertEquals("Machine Already On", test5.ActivateMachine());
        assertEquals("Lights Off"+"Power Off" , test5.ShutMachinie());
        assertEquals("Please turn the machine first", test5.pay(30));
    }
    @Test public void test6() {
        CoffeeMachine test6 = new CoffeeMachine();
        assertEquals("4"+ " Cups Of coffee Made!", test6.order(4,20));
    }
    @Test public void test8() {
    CoffeeMachine test8 = new CoffeeMachine();
    assertEquals("Power On!" + "Lights On!", test8.ActivateMachine());
    assertEquals("money received", test8.pay(40));
    assertEquals("8"+ " Cups Of coffee Made!", test8.order(10,40));
    }
}