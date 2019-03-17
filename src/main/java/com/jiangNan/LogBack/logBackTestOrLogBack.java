package com.jiangNan.LogBack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

//基于logback-test和logback.xml自动配置
public class logBackTestOrLogBack {
   /**
    * 当classpath中有基于xml的配置时，会优先使用xml配置 
    */
	final static Logger logger = LoggerFactory.getLogger(logBackTestOrLogBack.class);
	
	public static void main(String[] args) {
		//logger.info("logBackAndLogBackTest.xml");
		showErrorMessage();
	}
	
	/**
	 * 自动打印警告和错误信息
	 * 1.基于编程式配置，确保StatusPrinter始终打印状态信息
	 * 2.基于xml:configruation  debug=“true”
	 * 3.把默认配置文件的位置作为系统属性进行指定
	 * java -Dlogback.configurationFile=/path/to/config.xml chapters.configuration.MyApp1 
	 */
	public static void showErrorMessage(){
		LoggerContext  lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		StatusPrinter.printIfErrorsOccured(lc);
		
		logger.info("Entering appication!");
	}
}
