package com.test.assignment;

public class User {
	public void performOperation(Switch sw, String op) {
		if (op.equals("ON")) {
			sw.switchOn();
			System.out.println("TV Turned ON");
		} else {
			sw.switchOff();
			System.out.println("Refrigerator switched off");
		}
	}
}
