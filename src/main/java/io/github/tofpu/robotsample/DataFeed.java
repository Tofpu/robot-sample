package io.github.tofpu.robotsample;

import java.util.Stack;

public class DataFeed {
    private final Stack<String> dataFeed;

    public DataFeed() {
        this.dataFeed = new Stack<>();
    }

    public void write(final String nextFeed) {
        this.dataFeed.push(nextFeed);
    }

    public String read() {
        return this.dataFeed.pop();
    }

    public boolean hasNext() {
        return !this.dataFeed.isEmpty();
    }
}
