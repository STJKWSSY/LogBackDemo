package com.jiangNan.LogBack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//基于BasicConfiguration
public class BasicConfiguration {
	//自动配置，Logback会尝试寻找logBack.xml和logBack-test.xml,
	//如果找不到会使用BasicConfigurator对自己进行配置，这会导致记录输出到控制台
    final static Logger logger = LoggerFactory.getLogger(BasicConfiguration.class);
    
    public static void main(String[] args) {
    	//链式
		logger.info("Entering application.");
		Foo foo = new Foo();
		foo.doIt();
		logger.info("Exiting application.");
		OnConsoleStatusListenerDemo.statusListener();
	}
      
}
/**
 * 如果配置文件都在，那么logBack会默认使用BasicConfigurator,创建一个最小化配置，最小化配置有一个关联到根Logger
 * 的ConsoleAppender组成，输出模式为%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n 的 PatternLayoutEncoder 进行格式化
 * 根logger默认级别是DEBUG。
 * 
 * main通过调用LoggerFactory类和Logger类连接到logBack,取得想要的logger,然后继续，注意Foo类对logback唯一的依赖
 * 是通过引入LoggerFctor和Logger
 * 
 * 
 */
