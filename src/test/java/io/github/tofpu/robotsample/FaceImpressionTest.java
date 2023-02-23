package io.github.tofpu.robotsample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FaceImpressionTest {
    @Test
    public void test_empty_face_impression() {
        final DataFeed dataFeed = new DataFeed();
        final FaceImpression faceImpression = new FaceImpression(dataFeed);

        faceImpression.show();
        assertEquals(faceImpression.getCurrentFaceImpressionType(), FaceImpressionType.RESTING);
    }

    @Test
    public void test_invalid_data_with_face_impression() {
        final DataFeed dataFeed = new DataFeed();
        final FaceImpression faceImpression = new FaceImpression(dataFeed);

        dataFeed.write("Hi!");

        faceImpression.show();
        assertEquals(faceImpression.getCurrentFaceImpressionType(), FaceImpressionType.RESTING);
    }

    @Test
    public void test_correct_data_with_face_impression() {
        final DataFeed dataFeed = new DataFeed();
        final FaceImpression faceImpression = new FaceImpression(dataFeed);

        dataFeed.write("frown");

        faceImpression.show();
        assertEquals(faceImpression.getCurrentFaceImpressionType(), FaceImpressionType.FROWN);
    }
}
