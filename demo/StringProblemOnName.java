package com.uis.demo;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class StringProblemOnName {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = kb.nextLine();
		
		StringProblemOnName.printingName(name);
	}
	
	public static void printingName(String name) {
		if(name.length()==20) {
			System.out.println(name);
		}else if(name.length()>20) {
			String newname = name;
			for(int i = 1 ; i < name.length()-20 ; i++) {
				newname = StringUtils.chop(newname);
			}
			System.out.println(newname);
		}else if(name.length()<20) {
			for(int i = 1 ; i <= (20-name.length()) ;i++) {
				System.out.print("*");
			}
			System.out.println(name);
		}
	}

}
