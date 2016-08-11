package com.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.expensetracker"})
public class ExpenseTrackerApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ExpenseTrackerApplication.class, args);
	}
}
