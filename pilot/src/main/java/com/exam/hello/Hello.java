package com.exam.hello;



import java.util.HashMap;
import org.mule.api.MuleEventContext;


public class Hello implements org.mule.api.lifecycle.Callable {
	
	// used in invoke
	public void saySomething() {
		// HashMap hash = new HashMap();
		System.out.println("[Hello][saySomething] hello !!!");
	}
	
	public void saySomething(String in1, String in2) {
		System.out.println("[Hello][saySomething] with param");
	}
	// end
	
	// common style
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String propertyName = eventContext.getMessage().getInvocationProperty("propertyName");
		
		System.out.println("[Hello][onCall] " + eventContext.toString());
		System.out.println("[Hello][onCall] propertyName: " + propertyName);
		
		HashMap map = new HashMap();
		map.put("key", "value");
		
		return map;
	}
}
