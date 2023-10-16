import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
        @Test
        public void testSum ( ) {
            Calculator calculation = new Calculator( );
            int sum = calculation.Liczenie ( 2 , 5 );
            int testSum = 6 ;
            assertEquals ( sum , testSum , "Error calculating the sum!" );
        }

    }

