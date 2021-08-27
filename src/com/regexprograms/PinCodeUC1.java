package com.regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeUC1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[0-9]{6}");
		Matcher matcher = pattern.matcher("400088");
		
		boolean matchFound = matcher.find();
			if(matchFound) {
		      System.out.println("Match found");
		    }
			else {
		      System.out.println("Match not found");
		    }
	}
}
