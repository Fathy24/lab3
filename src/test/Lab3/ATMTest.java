package Lab3;
import junit.framework.TestCase;
import org.junit.Test;


public class ATMTest extends TestCase {
    @Test
    public void test1() {
        ATM test1 = new ATM();
        test1.CardBool = false;
        assertEquals("Card not validated", test1.CardValidation());
    }
    @Test
    public void test2() {
        ATM test2 = new ATM();
        assertEquals("Card Okay by bank", test2.CardValidation());
    }
    @Test public void test3() {
        ATM test3 = new ATM();
        assertEquals("Welcome", test3.enterPassword());
    }
    @Test public void test4() {
        ATM test4 = new ATM();
        assertEquals("Card Okay by bank", test4.CardValidation());
        test4.PassDetector = false;
        assertEquals("Wrong password! Please enter password again", test4.enterPassword());
    }
    @Test public void test5() {
        ATM test5 = new ATM();
        assertEquals("Card Okay by bank", test5.CardValidation());
        assertEquals("Welcome", test5.enterPassword());
        assertEquals("Not enough balance", test5.withdraw(10));
    }
    @Test public void test6() {
        ATM test6 = new ATM();
        assertEquals("Card Okay by bank", test6.CardValidation());
        assertEquals("Welcome", test6.enterPassword());
        assertEquals("Cant deposit money less than 50 and more than 20000 ", test6.deposit(10));
        assertEquals("Not enough balance", test6.withdraw(10));
    }
    @Test
    public void test7() {
        ATM test7 = new ATM();
        assertEquals("Card Okay by bank", test7.CardValidation());
        assertEquals("Welcome", test7.enterPassword());
        assertEquals("Successful deposit", test7.deposit(50));
        assertEquals("Not enough balance", test7.withdraw(70));
    }
    @Test public void test8() {
        ATM test8 = new ATM();
        assertEquals("Card Okay by bank", test8.CardValidation());
        assertEquals("Welcome", test8.enterPassword());
        assertEquals("Successful deposit", test8.deposit(1000));
        assertEquals("Successful withdraw", test8.withdraw(10));
    }
    @Test public void test9() {
        ATM test9 = new ATM();
        assertEquals("Card Okay by bank", test9.CardValidation());
        assertEquals("Welcome", test9.enterPassword());
        assertEquals("Cant deposit money less than 50 and more than 20000 ", test9.deposit(230000));
        assertEquals("Not enough balance", test9.withdraw(10));
    }
    @Test public void test10() {
        ATM test10 = new ATM();
        assertEquals("Card Okay by bank", test10.CardValidation());
        assertEquals("Welcome", test10.enterPassword());
        assertEquals("Cant deposit money less than 50 and more than 20000 ", test10.deposit(230000));
        assertEquals("Not enough balance", test10.withdraw(10));
        assertEquals("Successful deposit", test10.deposit(90));
        assertEquals("Successful withdraw", test10.withdraw(50));
    }
}