package com.example.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.info("This message will appear in both console and file.");
        logger.debug("Debug message written to both appenders.");
        logger.warn("Warning message logged.");
        logger.error("An error occurred while writing to both appenders.");
    }
}

