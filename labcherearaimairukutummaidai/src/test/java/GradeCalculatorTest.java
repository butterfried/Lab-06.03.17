/**
 * Created by Ploy on 13/3/2560.
 */
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class GradeCalculatorTest {
    @Test
    public void testCalculator(){
        GradeCalculator gc = new GradeCalculator();
	    assertThat(gc.calculate(25,28,32),is('B'));
        assertThat(gc.calculate(0,7,32,5),is('F'));
        assertThat(gc.calculate(20,21,32,25),is('A'));
        assertThat(gc.calculate(100,28),is('x'));
	    assertThat(gc.calculate(25,28,32),is('B'));
        assertThat(gc.calculate(90),is('B'));
	    assertThat(gc.calculate(65,1),is('C'));
        assertThat(gc.calculate(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),is('C'));
	    assertThat(gc.calculate(25,28,32),is('B'));
        assertThat(gc.calculate(40, 26),is('C'));
        assertThat(gc.calculate(20,12,6),is('F'));
        assertThat(gc.calculate(80,35,5),is('x'));
        assertThat(gc.calculate(81),is('B'));
        assertThat(gc.calculate(-5),is('U'));
    }
}
