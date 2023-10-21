package edu.hw2;

public class Task4 {
    private Task4() {

    }

    public static CallingInfo callingInfo() {
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        String className = methods[2].getClassName();
        String methodName = methods[2].getMethodName();
        return new CallingInfo(className, methodName);
    }

    public record CallingInfo(String className, String methodName) {
    }
}
