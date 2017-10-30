package com.ppd.test.apollo;

import org.springframework.beans.factory.annotation.Value;

public class TestJavaConfigBean {
	@Value("${timeout:10}")
	private int timeout;
	
	@Value("${cluster1key:10}")
	private String cluster1key;
	
	@Value("${ns1key:10}")
	private String ns1key;

	public String getNs1key() {
		return ns1key;
	}

	public void setNs1key(String ns1key) {
		this.ns1key = ns1key;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getCluster1key() {
		return cluster1key;
	}

	public void setCluster1key(String cluster1key) {
		this.cluster1key = cluster1key;
	}
	
	
	
}
