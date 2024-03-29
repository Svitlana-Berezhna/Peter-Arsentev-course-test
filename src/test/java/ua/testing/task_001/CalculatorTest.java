package ua.testing.task_001;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Calculator Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class CalculatorTest {

    @Test
    public void whenAddOneOnOneThenResultTwo() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1d, 1d);
        assertThat(calc.getResult(), is(2d));
    }

    @Test
    public void whenSubstractOneOnOneThenResultZero() throws Exception {
        Calculator calc = new Calculator();
        calc.substract(1d, 1d);
        assertThat(calc.getResult(), is(0d));
    }

    @Test
    public void whenMultipleOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.multiple(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test
    public void whenDivOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.div(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test(expected = IllegalStateException.class)
    public void whenDivByZeroThenException() throws Exception {
        Calculator calc = new Calculator();
        calc.div(1d, 0d);
    }

    @Test
    public void whenExpandOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.expand(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }
}
