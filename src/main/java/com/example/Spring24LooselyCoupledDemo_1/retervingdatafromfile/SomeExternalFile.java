package com.example.Spring24LooselyCoupledDemo_1.retervingdatafromfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalFile {
	
	
//	getting the value from the properties file
	@Value("${var_name}")
	private String url;

	public String getUrl() {
		return url;
	}
	
	
	
}
