package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {


    @Test
    public void TestThatBikeCanBeTurnedOn() {
        // I have an Automatic bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned on my bike
        automaticBike.setTurnOn(true);
        // check if my power is on
        boolean bikeIsOn = automaticBike.getTurnedOn();
        // Check if it is turned on
        assertTrue(bikeIsOn);
    }

    @Test
    public void TestThatBikeCanBeTurnedOff() {
        //given that I  have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned my bike on
        automaticBike.setTurnOn(false);
        // check if my bike is off
        boolean bikeIsOff = automaticBike.getTurnedOn();
        assertFalse(bikeIsOff);

    }

    @Test
    public void TestAccelerationByOne() {
        // given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned my bike on
        automaticBike.setTurnOn(true);
        // given that my bike will increase speed by one as the gear changes
        automaticBike.setSpeed(19);
        //when i have an speed, my bike should accelerate
        automaticBike.setAcceleration(1);
        // I should my gear adding up my speed by one
        int myBike = automaticBike.getAcceleration();
        assertEquals(20, myBike);


    }

    @Test
    public void TestAccelerationByTwo() {
        // given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned my bike on
        automaticBike.setTurnOn(true);
        // given that my bike will increase speed by one as the gear changes
        automaticBike.setSpeed(31);
        //when i have an speed, my bike should accelerate
        automaticBike.setAcceleration(3);
        // I should my gear adding up my speed by one
        int myBike = automaticBike.getAcceleration();
        assertEquals(34, myBike);


    }

    @Test
    public void TestAccelerationByThree() {
        // given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned my bike on
        automaticBike.setTurnOn(true);
        // given that my bike will increase speed by one as the gear changes
        automaticBike.setSpeed(37);
        //when i have an speed, my bike should accelerate
        automaticBike.setAcceleration(3);
        // I should my gear adding up my speed by one
        int myBike = automaticBike.getAcceleration();
        assertEquals(40, myBike);


    }

    @Test
    public void TestAccelerationByFour() {
        // given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // given that I turned my bike on
        automaticBike.setTurnOn(true);
        // given that my bike will increase speed by one as the gear changes
        automaticBike.setSpeed(44);
        //when i have an speed, my bike should accelerate
        automaticBike.setAcceleration(4);
        // I should my gear adding up my speed by one
        int myBike = automaticBike.getAcceleration();
        assertEquals(48, myBike);


    }

    @Test
    public void TestThatMyBikeCanDecreaseAcceleration() {
        //Given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // Given that my bike is turned on
        automaticBike.setTurnOn(true);
        // Given that I have initial speed of 24
        automaticBike.setSpeed(24);
        // When I decrease by 2, the speed decreases
        automaticBike.setdeceleration(2);
        // Check that my bike decreases by 2
        automaticBike.getdeceleration();
        assertEquals(22, automaticBike.getdeceleration());
    }

    @Test
    public void TestThatMyBikeCanDecreaseAccelerationBy4() {
        //Given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // Given that my bike is turned on
        automaticBike.setTurnOn(true);
        // Given that I have initial speed of 48
        automaticBike.setSpeed(48);
        // When I decrease by 4, the speed decreases
        automaticBike.setdeceleration(4);
        // Check that my bike decreases by 4
        automaticBike.getdeceleration();
        assertEquals(44, automaticBike.getdeceleration());
    }

    @Test
    public void TestThatMyBikeCanDecreaseAccelerationBy3() {
        //Given that I have a bike
        AutomaticBike automaticBike = new AutomaticBike();
        // Given that my bike is turned on
        automaticBike.setTurnOn(true);
        // Given that I have initial speed of 48
        automaticBike.setSpeed(35);
        // When I decrease by 3, the speed decreases
        automaticBike.setdeceleration(3);
        // Check that my bike decreases by 3
        automaticBike.getdeceleration();
        assertEquals(32, automaticBike.getdeceleration());
    }
@Test
public void TestBeyond40(){
  //Given that I have a bike that is on motion
  AutomaticBike automaticBike= new AutomaticBike();
  // Given that I am on stable speed in gear 1
  automaticBike.setSpeed(100);
  //When my bike increases here, speed increases
   automaticBike.setAcceleration(4);
   //check if my bike increase speed
   automaticBike.getdeceleration();
   assertEquals(104, automaticBike.getAcceleration());

    }


}


