package edu.hw1;

public class Task1 {
    private Task1() {

    }

    static final int SEC_IN_MIN = 60;
    private static boolean isValidFormat(String[] time) {
        for (String i : time) {
            if (!i.matches("\\d+")){
                return false;
            }
        }
        return true;
    }
    public static int minutesToSeconds(String time) {
        String[] minutesSeconds = time.split(":");
        if (minutesSeconds.length != 2 || !isValidFormat(minutesSeconds)) {
            return -1;
        }
        int minutes = Integer.parseInt(minutesSeconds[0]);
        int seconds = Integer.parseInt(minutesSeconds[1]);
        if (seconds >= SEC_IN_MIN || minutes * SEC_IN_MIN + seconds < 0) {
            return -1;
        } else {
            return minutes * SEC_IN_MIN + seconds;
        }
    }
}
