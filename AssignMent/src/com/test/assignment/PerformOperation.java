package com.test.assignment;

public class PerformOperation {

	public static void main(String[] args) {
		User u=new User();
		TVSwitch t=new TVSwitch();
		RefrigeratorSwitch rf=new RefrigeratorSwitch();
		u.performOperation(t, "ON");
		u.performOperation(rf , "OFF");

	}

}
