package Lab3;

public class CoffeeMachine {
     public boolean LightBool = false;
     public boolean CoffeeBool = false;
     public int money;
     public boolean Activity = false; private final float price = 5;
     public String pay(int m){
         if(Activity ==true) {
             this.money = m;
             return "money received";
         } else{
             return "Please turn the machine first";
         }
     }
     public String ActivateMachine(){
         if(Activity ==false) {
             Activity = true;
             LightBool = true;
             return "Power On!" + "Lights On!";
         }
         else{
             return "Machine Already On";
         }
     }
     public String ShutMachinie(){
         if(Activity ==true) {
             LightBool = false;
             Activity = false; return "Lights Off" + "Power Off";
         }
         else{
             return "Machine Already Off";
         }
     }
     public String order(int x, int money){
         int count= 0;
         this.money=money;
         if ((money) >= (price)) {
             while(money>= price && x > 0){
                 money -= price; CoffeeBool = true;
                 x --;
                 count++;
             }
         } else {
             return "Not enough Money to make "+count+" cups";
         }
        CoffeeBool = false; return count+ " Cups Of coffee Made!";
     }
}
