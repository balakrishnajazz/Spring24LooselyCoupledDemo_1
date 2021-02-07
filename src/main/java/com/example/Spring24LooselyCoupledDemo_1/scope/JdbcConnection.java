package com.example.Spring24LooselyCoupledDemo_1.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//If we used prototype as a scope we get same instance here
//this is because this class is called from the PersonDao
//Which holds the Singleton as an instance by default.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("In Jdbc Connection");
	}
}
