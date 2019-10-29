package com.fdmgroup.LoggingDemo;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemoApp {

	private final static Logger programmerLog = LogManager.getLogger();
	private final static Logger managerLog = LogManager.getLogger("managerLogs");
	private final static Logger testerLog = LogManager.getLogger("testerLogs");
	static Logger rootLogger = LogManager.getRootLogger();

	public static void main(String[] args) {

		// Root logger object logs the trace and fatal messages

		rootLogger.trace("Root Trace Message");
		rootLogger.fatal("Root Fatal Message");

		// ProgrammerLog - logs all levels from trace to fatal
		programmerLog.trace("Programmer Log: Trace message");
		programmerLog.debug("Programmer Log: Debug message");
		programmerLog.info("Programmer Log: Info message");
		programmerLog.warn("Programmer Log: Warn message");
		programmerLog.error("Programmer Log: Error message");
		programmerLog.fatal("Programmer Log: Fatal message");

		// ManagerLog - logs all levels from trace to fatal
		managerLog.trace("Manager Log: Trace message");
		managerLog.debug("Manager Log: Debug message");
		managerLog.info("Manager Log: Info message");
		managerLog.warn("Manager Log: Warn message");
		managerLog.error("Manager Log: Error message");
		managerLog.fatal("Manager Log: Fatal message");
		
		testerLog.trace("Manager Log: Trace message");
		testerLog.debug("Manager Log: Debug message");
		testerLog.info("Manager Log: Info message");
		testerLog.warn("Manager Log: Warn message");
		testerLog.error("Manager Log: Error message");
		testerLog.fatal("Manager Log: Fatal message");

	}

}
