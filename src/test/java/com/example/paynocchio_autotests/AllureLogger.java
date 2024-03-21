package com.example.paynocchio_autotests;

import io.qameta.allure.Step;
import org.slf4j.Logger;

public class AllureLogger {
    private final Logger logger;
    public AllureLogger (Logger logger) {
        this.logger = logger;
    }
    @Step
    public void info (String logText) {
        logger.info(logText);
    }
}