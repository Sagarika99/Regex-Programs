package com.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeUC1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(^[0-9]{3}\\s{0,1}[0-9]{3}$)");
		Matcher matcher = pattern.matcher("400 088");
		
		boolean matchFound = matcher.find();
			if(matchFound) {
		      System.out.println("Valid");
		    }
			else {
		      System.out.println("Invalid");
		    }
	}
}
