package com.jiangNan.LogBack.Chapt1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWord {
	
      public static void main(String[] args) {
		 LogbackChapt2();
	  }
      
      public static void LogbackChapt1(){
    	Logger log = LoggerFactory.getLogger(HelloWord.class);
  		log.trace("====== trace");
  		log.debug("====== debug");
  		log.info("====== info");
  		log.warn("====== warn");
  		log.error("====== error");
      }
      
      public static void LogbackChapt2(){
    	  Logger log = LoggerFactory.getLogger(HelloWord.class);
    		log.trace("====== trace");
    		log.debug("====== debug");
    		log.info("====== info");
    		log.warn("====== warn");
    		log.error("====== error");
      }
}
