package com.himline.chapter_2;

public class SubSubAlpha extends Alpha {
	private SubSubAlpha() {
		s += "subsub ";
	}

	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
