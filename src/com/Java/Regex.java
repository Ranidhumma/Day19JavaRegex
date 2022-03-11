package com.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		System.out.println("Welcome to user registartion");

		/* Last name starts with Cap and has minimum 3 characters */

		Pattern p = Pattern.compile("[a-z]{2,}[A-Z]{1}");
		Matcher m = p.matcher("xyR");
		boolean b = m.matches();
		// System.out.println(b);
		if (b)
			System.out.println("Valid Input passed");
		else
			System.out.println("Invalid input passed");
	}

}
