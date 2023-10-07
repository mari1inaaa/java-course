package edu.hw1;

public class Task1 {
    private Task1() {

    }

    public static int minutesToSeconds(String time) {
        final int SEC_IN_MIN = 60;
        String[] minutesSeconds = time.split(":");
        if (minutesSeconds.length != 2) {
            return -1;
        }
        int minutes = Integer.parseInt(minutesSeconds[0]);
        int seconds = Integer.parseInt(minutesSeconds[1]);
        if (seconds >= SEC_IN_MIN) {
            return -1;
        } else {
            return minutes * SEC_IN_MIN + seconds;
        }
    }
}
