package com.ppd.test.apollo;

import org.springframework.beans.factory.annotation.Value;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;


public class TestApolloAnnotationBean {
	@ApolloConfig
	private Config config;
	
	@ApolloConfig("TEST1.namespacetest")
	private Config nsConfig;

	@Value("${timeout:10}")
	private int timeout;

	@Value("${cluster1key:10}")
	private String cluster1key;

	@Value("${ns1key:10}")
	private String ns1key;
	
	
	
	public void calc(){
		for (int i=0;i<10;i++){
			System.out.println("1timeout="+timeout);
			System.out.println("1cluster1key="+cluster1key);
			System.out.println("1ns1key="+ns1key);
			try {
				Thread.sleep(10*1000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
	}
	
	  @ApolloConfigChangeListener("application")
	  private void anotherOnChange(ConfigChangeEvent changeEvent) {
	    if (changeEvent.isChanged("timeout")){
	    	System.out.println("timeout changed.new value:"+config.getIntProperty("timeout", 10));
	    	this.timeout=config.getIntProperty("timeout", 10);
	    }
	  }
}
