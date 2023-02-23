package io.github.tofpu.robotsample;

public class FaceImpression {
    private final DataFeed dataFeed;
    private FaceImpressionType currentFaceImpressionType = FaceImpressionType.RESTING;

    public FaceImpression(final DataFeed dataFeed) {
        this.dataFeed = dataFeed;
    }

    public void show() {
        if (!this.dataFeed.hasNext()) {
            return;
        }

        final String feed = this.dataFeed.read();
        try {
            this.currentFaceImpressionType = FaceImpressionType.valueOf(feed.toUpperCase());
        } catch (IllegalArgumentException ignored) {
            // unknown feed impression; ignored
        }
    }

    public FaceImpressionType getCurrentFaceImpressionType() {
        return currentFaceImpressionType;
    }
}
