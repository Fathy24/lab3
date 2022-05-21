package Lab3;
public class ATM {
    public float UBalance = 0;
    public boolean IsAvailable = false;
    public boolean CardBool = true;
    public boolean PassDetector = true;
    public String CardValidation() {
        if (CardBool) {
            return "Card Okay by bank";
        } else {
            return "Card not validated";
        }
    }
    public String enterPassword() {
        if (PassDetector == true) {
            IsAvailable = true; return "Welcome";
        } else {
            return "Wrong password! Please enter password again";
        }
    }
    public String deposit(float Amount){
        if (Amount >= 50 && Amount <= 20000) {
            UBalance += Amount; return "Successful deposit";
        } else {
            return "Cant deposit money less than 50 and more than 20000 ";
        }
    }
    public String withdraw(float amount){
        if (amount < UBalance) {
            UBalance -= amount;
            return "Successful withdraw";
        } else {
            return "Not enough balance";
        }
    }
}
