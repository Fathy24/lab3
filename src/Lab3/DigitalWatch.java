package Lab3;

public class DigitalWatch {
    public boolean Activity = false;
    public boolean TimerBool = false;
    public float timer = 0;
    public String Activate(){
        if(Activity ==false){
            Activity = true;
            return "Welcome!";
        } else{
            return "Already turned on";
        }
    }
    public String setTimer(float x){
        if(Activity ==true){
            timer = x; TimerBool = true;
            return "Timer starts now";
        } else{
            return "Watch is closed open first";
        }
    }
    public String ShutDown(){
        if(Activity ==true){
            Activity = false;
            return "Turned off";
        } else{
            return "Watch is Already off";
        }
    }
}