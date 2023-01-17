/*
 * using algs4 StdIn when inputting data from console remember to input EOF character
*/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;
 
public class Zadanie_2a {

	public static void main(String[] args) {
		Stack<String> par = new Stack<String>();
		while(!StdIn.isEmpty()) {
			String tmp = String.valueOf(StdIn.readChar());
			if (tmp.equals(")") && par.peek().equals("(")) {
				par.pop();
			} else if(tmp.equals("]") && par.peek().equals("[")) {
				par.pop();
			} else if(tmp.equals("}") && par.peek().equals("{")) {
				par.pop();
			} else {
				par.push(tmp);
			}
		}
		if(par.size() > 0) {
			StdOut.print("false");
		} else {
			StdOut.print("true");
		}
	}

}
