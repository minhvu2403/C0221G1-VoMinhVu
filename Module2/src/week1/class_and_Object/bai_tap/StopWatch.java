package week1.class_and_Object.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
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

    public void selectionSort(List array) {
        Collections.sort(array);
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        List<String> list = new ArrayList<>(7);
        list.add("Long");
        list.add("Vu");
        list.add("Hien");
        list.add("Hoang");
        list.add("Viet");
        list.add("Hue");
        list.add("Tuan");
        stopWatch.start();
        stopWatch.selectionSort(list);
        stopWatch.stop();
        System.out.println("Program run time:" + stopWatch.getElapsedTime());
    }
}
