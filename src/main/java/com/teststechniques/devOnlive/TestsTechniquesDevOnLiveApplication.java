package com.teststechniques.devOnlive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestsTechniquesDevOnLiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestsTechniquesDevOnLiveApplication.class, args);

		int fact = 4;
		
		Factorial.ResultFactorial(fact);

		boolean choice = true;
		int[] tab = { 56, 34, 0, 120, 6, 3 };
		
		TabSorting.sortTable(tab, choice);
		
		choice = false;
		TabSorting.sortTable(tab, choice);
	}

}
