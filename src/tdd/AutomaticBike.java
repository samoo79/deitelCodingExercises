package tdd;

public class AutomaticBike {

    private boolean turnedOn;
    private int speed;




    public void setTurnOn(boolean power) {
        turnedOn = power;
        if (power != turnedOn){
            turnedOn = false;
        }
    }

    public boolean getTurnedOn() {
        return turnedOn;
    }
    public void setSpeed (int speed) {
        this.speed = speed;
    }


    public void setAcceleration(int gear) {
        if ((turnedOn) &&
                (gear == 1 && speed > 0 && speed <= 19)) {
            speed = speed + gear;
        }
        else { if (gear == 2 && speed > 20 && speed <= 28) {
                speed = speed + gear;
            }
            else { if (gear == 3 && speed > 30 && speed <= 37) {
                    speed = speed + gear;
                } else {
                    if (gear == 4 && speed > 40) {
                        speed = speed + gear;
                    }
                }
            }
        }

    }

    public int getAcceleration() {
        return speed;
    }


    public void setdeceleration(int digear) {
        speed = speed - digear;
    }

    public int getdeceleration() {
        return speed;
    }
}








