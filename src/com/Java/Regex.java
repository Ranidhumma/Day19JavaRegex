package com.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		System.out.println("Welcome to user registartion");

		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher("Axy");
		boolean b = m.matches();
		// System.out.println(b);
		if (b)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

}
