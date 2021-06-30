package com.sriram.presentation;

public interface EmployeePresentation {
	void showMenuEmp();
	void performMenuEmp(String choice);
	boolean authenticate(String username,String password);
}