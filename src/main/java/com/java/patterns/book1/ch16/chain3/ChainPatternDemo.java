package com.java.patterns.book1.ch16.chain3;

public class ChainPatternDemo {


    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information. 这是info");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "\n This is an debug level information. 这是debug");

        loggerChain.logMessage(AbstractLogger.ERROR,
                " \n This is an error information. 这是error");
    }
}
