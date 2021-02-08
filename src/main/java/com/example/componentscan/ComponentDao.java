package com.example.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.Spring24LooselyCoupledDemo_1.scope.JdbcConnection;

@Component
//Here we are getting different instances since we have used prototype as a scope.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDao {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}
	
	
}
