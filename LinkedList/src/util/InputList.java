package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;

public class InputList {
	
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);
	
	public static String[] getList() throws IOException {
	
		return 	br.readLine().split(" ");
	}
}
