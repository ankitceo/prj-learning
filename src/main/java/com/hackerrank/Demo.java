package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;

public class Demo {

	public static void main(String... args) throws Exception {
		Locale ind = new Locale("en", "IN");
		NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat.getCurrencyInstance(ind);
		NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat.getCurrencyInstance(Locale.FRANCE);
	}
}
