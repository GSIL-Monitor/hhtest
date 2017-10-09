package com.ppd.test.apollo;

import org.springframework.stereotype.Component;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

@Component
public class Calc {
	public void calc(){
		Config config = ConfigService.getAppConfig();
		String someKey = "someKey";
		String someDefaultValue = "defaultValue";
		String value = config.getProperty(someKey, someDefaultValue);
		System.out.println("value="+value);
	}
}
