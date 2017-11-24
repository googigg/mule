package com.exam.hello;



import org.mule.api.MuleEventContext;

public class ValidateInput implements org.mule.api.lifecycle.Callable {
	
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// store value before using outside
		eventContext.getMessage().setInvocationProperty("keyHello", 2);
		
		return null;
	}
}
