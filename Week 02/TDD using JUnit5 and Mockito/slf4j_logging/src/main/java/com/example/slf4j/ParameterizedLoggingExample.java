package com.example.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Alice";
        int userId = 101;

        logger.info("User {} has logged in with ID {}", user, userId);
        logger.debug("Debugging info for user: {} with ID: {}", user, userId);
        logger.warn("Warning: User {} might be accessing restricted data", user);
        logger.error("Error occurred while processing request for user {}", user);
    }
}

