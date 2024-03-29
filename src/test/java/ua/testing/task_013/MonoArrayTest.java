package ua.testing.task_013;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * <h1>Mono Array Test</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class MonoArrayTest {

    @Test
    public void mono() {
        MonoArray array = new MonoArray(new int[]{1, 1, 1});
        boolean result = array.exists();
        assertThat(result, is(true));
    }

    @Test
    public void notMono() {
        MonoArray array = new MonoArray(new int[]{0, 1, 1, 1, 0});
        boolean result = array.exists();
        assertThat(result, is(false));
    }
}
