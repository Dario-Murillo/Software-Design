public class Stopwatch {
    private long startTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = System.nanoTime();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            running = false;
        }
    }

    public long elapsedMillis() {
        if (running) {
            return (System.nanoTime() - startTime) / 1000000;
        } else {
            return 0;
        }
    }

    public long elapsedSeconds() {
        return elapsedMillis() / 1000;
    }
}
