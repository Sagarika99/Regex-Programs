package com.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^([a-z\\.a-z]*)");
		String expression = "abc.xyz@bridgelabz.co.in";
		Matcher matcher = pattern.matcher(expression);
		
		if (matcher.find()) {
			System.out.println("Found value: " +matcher.group(0));
		}
	}

}
