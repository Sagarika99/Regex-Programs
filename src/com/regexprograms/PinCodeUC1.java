package com.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeUC1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(^[0-9]{6}$[^A-Z])");
		Matcher matcher = pattern.matcher("Ab400088");
		
		boolean matchFound = matcher.find();
			if(matchFound) {
		      System.out.println("Valid");
		    }
			else {
		      System.out.println("Invalid");
		    }
	}
}
