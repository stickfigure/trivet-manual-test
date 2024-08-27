package org.example;

import com.voodoodyne.trivet.Remote;

@Remote
public class HelloImpl implements Hello {
	@Override
	public String hi() {
		throw new WeirdException("this exception isn't on the client classpath");
	}
}