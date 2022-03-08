import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addShouldReturnTwelve() {
        //Arrange
        Calculator testCalc = new Calculator();

        //Act
        double result = testCalc.add(10.0,2.0);

        //Assert
        assertEquals(result, 12.0);
    }

    @Test
    void addShouldAddWholeList(){
        Calculator  testCalc = new Calculator();

        List<Double> testNums = new ArrayList<>();
        for(double i=1.0;i<6.0;i++)
            testNums.add(i);

        double result = testCalc.addList(testNums);

        assertEquals(result,15.0);
    }

    @Test
    void subtractShouldReturnEight() {
        //Arrange
        Calculator testCalc = new Calculator();

        //Act
        double result = testCalc.subtract(10.0,2.0);

        //Assert
        assertEquals(result, 8.0);
    }

    @Test
    void multiplyShouldReturnTwenty() {
        //Arrange
        Calculator testCalc = new Calculator();

        //Act
        double result = testCalc.multiply(10.0,2.0);

        //Assert
        assertEquals(result, 20.0);
    }

    @Test
    void divideShouldReturnFive() {
        //Arrange
        Calculator testCalc = new Calculator();

        //Act
        double result = testCalc.divide(10.0,2.0);

        //Assert
        assertEquals(result, 5.0);
    }

    @Test
    void squareRootShouldReturnSquareRootOfNine() {
        //Arrange
        Calculator testCalc = new Calculator();

        //Act
        double result = testCalc.squareRoot(9.0);

        //Assert
        assertEquals(result, 3.0);
    }
}