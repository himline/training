package com.himline.chapter_4;
import javax.swing.JButton;
public class CompareReference {
	public static void main(String[] args) {
		JButton a = new JButton("Exit");
		JButton b = new JButton("Exit");
		JButton c = a;
		System.out.println("Is reference a == b? " + (a == b));
		System.out.println("Is reference a == c? " + (a == c));
		}
}
