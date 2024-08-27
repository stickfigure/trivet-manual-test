package org.example;

import com.voodoodyne.trivet.Client;

public class Main {
	public static void main(String[] args) {
		final Hello client = Client.create("http://localhost:7778/hello", Hello.class);
		client.hi();
	}
}