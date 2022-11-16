package tdd;

public class AirCondition {
    private int temp;
    private boolean power;


    public void isOn(boolean ac) {
        if (ac == power) {
            power = true;
        }
    }



    public boolean getOn() {
        return true;
    }

    public void setTemp(int degree){
        if (degree >= 16 && degree <= 30){
           temp = degree;
        }


    }

    public int getTemp() {

        return temp;
    }
}
