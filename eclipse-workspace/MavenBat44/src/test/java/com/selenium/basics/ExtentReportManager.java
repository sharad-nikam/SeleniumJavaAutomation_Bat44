package com.selenium.basics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir")
                + "/test-output/ExtentReport.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("Automation Test Report");
        reporter.config().setDocumentTitle("Test Execution Report");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("Tester", "Sharad");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }
}