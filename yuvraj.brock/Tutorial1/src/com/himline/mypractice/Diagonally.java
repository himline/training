package com.himline.mypractice;

public class Diagonally {

	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 String str = "YUVRAJ";
	 String pad = "";
	 for (int i = 0; i < str.length(); i++) {
	 pad = str.substring(i, i + 1);
	 pad = spaceLeft(pad, i + 1);
	 System.out.println(pad);
	 }
	
	 }
	
	 public static String spaceLeft(String str, int position) {
	 return String.format("%1$" + position + "s", str);
	 }
//	public static void main(String[] args) {
//
//		String diag = "YUVRAJ";
//		String pad = "     ";
//
//		for (int i = 0; i < diag.length(); i++) {
//			pad = diag.substring(i, i + 1);
//			pad = padLeft(pad, i + 1);
//
//			System.out.println(pad);
//		}
//	}
//
//	public static String padLeft(String str, int position) {
//		return String.format("%1$" + position + "s", str);
//	}

}
