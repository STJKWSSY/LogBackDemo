package com.jiangNan.LogBack;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;

/**
 * 对statusManage添加一个StatusListener，注册一个状态监听器方便实现对logback内部状态的无人监管
 * @author 姜楠
 *
 */
public class OnConsoleStatusListenerDemo {
    
	
	/**
	 * statusLostener
	 * 注册了的状态监听器只会接受被注册之后的状态消息,不会注册之前的消息
	 * 1：编程式
	 * 2：基于xml  onConsoleStatusListener.xml
	 * 3:设置java系统属性
	 * java -Dlogback.statusListenerClass=ch.qos.logback.core.status.OnConsoleStatusListener
	 * url: http://host/yourWebapp/lbClassicStatus 
	 */
	public static void statusListener(){
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusManager statusManager = lc.getStatusManager();
		OnConsoleStatusListener  onConsoleListener = new OnConsoleStatusListener();
		statusManager.add(onConsoleListener);
	}
}
