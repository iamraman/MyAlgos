package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;

public class InputList {
	
	public static String[] getList() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		return 	br.readLine().split(" ");

	}
}
