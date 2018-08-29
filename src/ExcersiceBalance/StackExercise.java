package ExcersiceBalance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import GenericEstructure.AlbertList;
import TDA.iStack;

public class StackExercise {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static String balance(String s) {
		iStack<String> pila = new AlbertList<String>();

		for (int i = 0; i < s.length(); i++) {
			String c = s.charAt(i) + "";

			if (c.equals("(") || c.equals("[") || c.equals("{")) {
				pila.push(c + "");
			} else if (c.equals(")") || c.equals("]") || c.equals("}")) {

				if (pila.isEmpty()) {
					return "F";
				}
				if (c.equals(")") && !pila.pop().getType().equals("(")) {
					return "F";
				}
				if (c.equals("]") && !pila.pop().getType().equals("[")) {
					return "F";
				}
				if (c.equals("}") && !pila.pop().getType().equals("{")) {
					return "F";
				}
			} else {
				return "T";
			}
		}
		if (pila.isEmpty()) {
			return "T";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		long index = Long.parseLong(bf.readLine());
		String line = bf.readLine();
		for (long i = 0; i < index; i++) {
			System.out.println(balance(line));
			line = bf.readLine();
		}
	}

}
