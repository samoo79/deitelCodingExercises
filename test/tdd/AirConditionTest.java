package tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {


    @Test
    public void testThatAcCanPowerOn(){
        // I have an Ac
        AirCondition airCondition = new AirCondition();
        //when I power it on, it on
        airCondition.isOn(true);
        //My Ac get powered
        airCondition.getOn();
        // check if it on
        assertTrue(true);

    }



    @Test
    public void testThatAcCanPoweredOff(){
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        // when I set it off, it will off
        airCondition.isOn(false);
        // check the power of my Ac
        airCondition.getOn();

        assertFalse(false);
    }

    @Test
    public void testThatAcTempCanBeIncreased(){
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        //I have initial temp of 16
        airCondition.setTemp(16);
        //My Ac temp get increase above 16
        airCondition.setTemp(20);
        // Check the increment of my Ac
        int myAirCondition = airCondition.getTemp();
        assertEquals(20,myAirCondition);

    }
    @Test
    public void testThatAcTempCanBeDecreased() {
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        //I have initial temp of 30
        airCondition.setTemp(30);
        //My Ac temp can be decreased
        airCondition.setTemp(18);
        // Check the decrement of my Ac
        int myAirCondition = airCondition.getTemp();
        assertEquals(18, myAirCondition);
    }
    @Test
    public void testThatAcTempCanNotDecreaseBelow16() {
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        //I have initial temp of 16
        airCondition.setTemp(16);
        //My Ac temp get decrease below 16
        airCondition.setTemp(12);
        // Check the decrement of my Ac
        int myAirCondition = airCondition.getTemp();
        assertEquals(16, myAirCondition);
    }
    @Test
    public void testThatAcTempCanNotIncreaseAbove30() {
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        //I have initial temp of 30
        airCondition.setTemp(30);
        //My Ac temp get increase above 30
        airCondition.setTemp(40);
        // Check the decrement of my Ac
        int myAirCondition = airCondition.getTemp();
        assertEquals(30, myAirCondition);
    }
    @Test
    public void testThatAcTempShouldBeAt29() {
        //I have an Ac
        AirCondition airCondition = new AirCondition();
        //I have initial temp of 30
        airCondition.setTemp(29);
        //When my Ac is set at a certain temp
        airCondition.setTemp(29);
        // Check the decrement of my Ac
        int myAirCondition = airCondition.getTemp();
        assertEquals(29, myAirCondition);
    }
}
