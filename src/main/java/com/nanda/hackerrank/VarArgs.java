/**
 * 
 */
package com.nanda.hackerrank;

/**
 * @author Nandakumar 05-Jun-2017
 *
 */
public class VarArgs {
    
    public static void main(String[] args) {
	
	Add add = new Add();
	add.add(1,2);
	add.add(1,2,3);
	add.add(1,2,3,4);
    }

}

class Add {

    public void add(int... a) {

	int sum = 0;
	StringBuilder sb = new StringBuilder();

	for (int i : a) {
	    sb = sb.append(i);
	    sum = sum + i;
	    sb = sb.append("+");
	}
	
	sb = sb.deleteCharAt(sb.lastIndexOf("+"));
	System.out.println(sb.append("=").append(sum));

    }
}
