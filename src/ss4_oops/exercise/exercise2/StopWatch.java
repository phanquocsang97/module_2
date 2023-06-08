package ss4_oops.exercise.exercise2;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        System.out.println(java.time.LocalTime.now());
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
