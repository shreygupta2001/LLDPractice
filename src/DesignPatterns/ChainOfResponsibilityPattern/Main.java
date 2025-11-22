package DesignPatterns.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception happened");
        logProcessor.log(LogProcessor.DEBUG, "Debug this");
        logProcessor.log(LogProcessor.INFO, "Info message");
    }
}
