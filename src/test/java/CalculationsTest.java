import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationsTest {


    @Test
    void yield25_whenCheckingSquare5(){
        int number = 5;

        Calculations calculations = new Calculations();
        int actual = calculations.squareNumber(number);
        int expected = 25;

        Assertions.assertEquals(actual, expected);
    }
 @Test
    void yield1_whenCheckingSquare0(){
        int number = 0;

        Calculations calculations = new Calculations();
        int actual = calculations.squareNumber(number);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


}
