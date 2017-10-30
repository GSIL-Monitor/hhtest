package com.ppd.test.apollo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@Configuration
@EnableApolloConfig({"TEST1.namespacetest","application"})
public class AppConfig {
	// @Bean
	// public TestJavaConfigBean javaConfigBean() {
	// return new TestJavaConfigBean();
	// }
	
	@Bean
	public TestApolloAnnotationBean testApolloAnnotationBean() {
		return new TestApolloAnnotationBean();
	}
	
	//dev branch test
	
	// dev brach1
	
	// dev branch3
}
