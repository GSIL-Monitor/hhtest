package com.ppd.test.apollo;

import org.springframework.beans.factory.annotation.Autowired;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;


public class Calc {
	@Autowired
	TestJavaConfigBean bean;
	
	public void calc1(){
		Config config = ConfigService.getAppConfig();
		String someKey = "timeout";
		String someDefaultValue = "defaultValue";
		String value = config.getProperty(someKey, someDefaultValue);
		System.out.println("timeout="+value);
//		System.out.println("cluster1key="+config.getProperty("cluster1key", someDefaultValue));
		
		Config nsConfig = ConfigService.getConfig("TEST1.namespacetest");
//		System.out.println("cluster1key="+);
	}
	
	public void calc(){
		
		System.out.println("timeout="+bean.getTimeout());
		System.out.println("Cluster1key="+bean.getCluster1key());
		System.out.println("ns1key="+bean.getNs1key());
		
	}
}
