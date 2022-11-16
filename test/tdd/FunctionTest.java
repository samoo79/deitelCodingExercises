package tdd;

import chapterFour.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {

@Test
public void TestForTwoCopies(){

    Function samuel = new Function();

    int multipleOf = samuel.multiply(10,2000);

    assertEquals(16000, multipleOf);

}
@Test
public void TestForThreeCopies(){

    Function samuel = new Function();

    int times = samuel.multiply(3,2000);

    assertEquals(6000,times);
}

    @Test
    public void TestForFiveCopies() {

        Function samuel = new Function();

        int times = samuel.multiply(5, 1800);

        assertEquals(9000, times);
    }
    @Test
    public void TestFor10Copies() {

        Function samuel = new Function();

        int times = samuel.multiply(10, 1600);

        assertEquals(16000, times);
    }
@Test
public void TestFor40Copies(){

    Function utme = new Function();

    int book = utme.multiply(40,1500);

    assertEquals(60000,book);


}

    @Test
    public void TestFor2000Copies() {

        Function samuel = new Function();

        int times = samuel.multiply(2000, 1000);

        assertEquals(2_000_000, times);
    }
    @Test
    public void TestFor100Copies() {

        Function samuel = new Function();

        int times = samuel.multiply(100, 1200);

        assertEquals(120000, times);
    }
    @Test
    public void TestFor52Copies() {

        Function samuel = new Function();

        int times = samuel.multiply(52, 1300);

        assertEquals(67600, times);
    }
}

