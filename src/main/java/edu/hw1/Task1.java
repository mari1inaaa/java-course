package edu.hw1;

public class Task1 {
    public static int minutesToSeconds(String time) {
        String[] minutesSeconds = time.split(":");
        if (minutesSeconds.length != 2) {
            return -1;
        }
        int minutes = Integer.parseInt(minutesSeconds[0]);
        int seconds = Integer.parseInt(minutesSeconds[1]);
        if (seconds >= 60) {
            return -1;
        } else {
            return minutes * 60 + seconds;
        }
    }
}
