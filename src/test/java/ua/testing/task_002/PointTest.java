package ua.testing.task_002;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Point Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class PointTest {

    @Test
    public void whenHasTwoPointThenReturnDistance() {
        final Point first = new Point(0, 0);
        final Point second = new Point(0, 1);
        double result = first.distanceTo(second);
        assertThat(result, is(1d));
    }
}
