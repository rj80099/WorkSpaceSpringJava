package com.app.lmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//dependent (parent)
@Component
@Scope("singleton")
public class TokenService {

	@Autowired
	private Token token;

	
	public Token getToken() {
		token = getNewTokenObj();
		return token;
	}
	   
	/**************************************
	 * 
	 * 
	 * Solution: LMI
	 */
	@Lookup
	public Token getNewTokenObj() {
		//container provides
		return null;
		
	}


	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	
}
