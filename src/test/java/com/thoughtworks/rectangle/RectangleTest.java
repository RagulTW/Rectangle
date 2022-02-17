package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
public class RectangleTest {

    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        
        Rectangle rectangle= new Rectangle(4.3, 7.3);
        double actual;
        double expected=4.3*7.3;

        actual= rectangle.area();

       assertThat(actual, is(closeTo(expected,0.001)));
       
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){
        Rectangle rectangle = new Rectangle(4.3,7.3);
        double expected=2*(4.3+7.3);
        double actual;

        actual = rectangle.perimeter();

        assertThat(actual,is(closeTo(expected,0.1)));



    }
}
