/*
 * using algs4 StdIn when inputting data from console remember to input EOF character
 * 
 * input type : 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
 * warning: if parenthesis are incorrect then you will get a strange result
*/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;
import java.lang.StringBuilder;

public class Zadanie_2b {

	public static void main(String[] args) {
		
		Stack<String> par = new Stack<String>();
		Stack<String> ops  = new Stack<String>();
        Stack<String> vals = new Stack<String>();
        StringBuilder res = new StringBuilder();
        
		while(!StdIn.isEmpty()) {
			String tmp = StdIn.readString();
				 if (tmp.equals("+"))    ops.push(tmp);
            else if (tmp.equals("-"))    ops.push(tmp);
            else if (tmp.equals("*"))    ops.push(tmp);
            else if (tmp.equals("/"))    ops.push(tmp);
            else if (tmp.equals(")")) {
            	if (!vals.isEmpty()) {
	            	String s = tmp + vals.pop() + ops.pop() + vals.pop() + "(";
	            	StringBuilder rev = new StringBuilder();
	            	rev.append(s);
	            	par.push(rev.toString());
            	} else {
            		String s = tmp + par.pop() + ops.pop() + par.pop() + "(";
	            	StringBuilder rev = new StringBuilder();
	            	rev.append(s);
	            	par.push(rev.toString());
	            	res = rev;
            	}
            } else vals.push(tmp);
		} 
		res.reverse();
		StdOut.print(res.toString());
	}

}
