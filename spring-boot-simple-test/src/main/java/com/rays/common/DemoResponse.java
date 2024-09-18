
package com.rays.common;

import java.util.HashMap;
import java.util.Map;

public class DemoResponse {

	private String data;

	private String message;
	private Map<String , Object> result=new HashMap<String, Object>();

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTest() {
		return message;
	}

	public void setTest(String message) {
		this.message = message;
	}
}
