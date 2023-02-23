package io.github.tofpu.robotsample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DataFeedTest {
    @Test
    public void test_data_feed() {
        final DataFeed dataFeed = new DataFeed();
        dataFeed.write("Hi");

        assertTrue(dataFeed.hasNext());
        assertEquals(dataFeed.read(), "Hi");
    }
}
