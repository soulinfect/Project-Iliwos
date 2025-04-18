package com.Iluwos;

public class IluwoSLogger {
    private static final String PREFIX = "[IluP] "; 
    private static final String DEBUG = "[DEBUG] ";
    private static final String INFO = "[INFO] ";
    private static final String ERROR = "[ERROR] ";
    private static final String TAG = "iluwosproject"; 

    public static void debug(String message) {
        System.out.println(PREFIX + DEBUG + message + " - " + TAG);
    }

    public static void info(String message) {
        System.out.println(PREFIX + INFO + message + " - " + TAG);
    }

    public static void error(String message) {
        System.err.println(PREFIX + ERROR + message + " - " + TAG);
    }

    public static void error(String message, Throwable throwable) {
        System.err.println(PREFIX + ERROR + message + " - " + TAG);
        throwable.printStackTrace();
    }
}
