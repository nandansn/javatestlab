/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 02-May-2017
 *
 */
public class StringProblems {

    public static void main(String[] args) {

	String tage = makeTags("I", "Hello");

	StringProblems pr = new StringProblems();
	String repeat = pr.extraEnd("Hello");

	System.out.println(pr.firstTwo(""));

	System.out.println(repeat);

    }

    public static String makeTags(String tag, String word) {

	StringBuilder startTagBuider = new StringBuilder(tag);
	startTagBuider.insert(0, "<");
	startTagBuider.insert(tag.length() + 1, ">");

	System.out.println(startTagBuider.toString());

	StringBuilder endTagBuider = new StringBuilder(tag);
	endTagBuider.insert(0, "</");
	endTagBuider.insert(tag.length() + 2, ">");

	System.out.println(endTagBuider.toString());

	StringBuilder wordBuilder = new StringBuilder(word);

	wordBuilder.insert(0, startTagBuider.toString());
	word = wordBuilder.toString();
	wordBuilder = new StringBuilder(word);
	wordBuilder.insert(word.length(), endTagBuider.toString());

	return wordBuilder.toString();

    }

    public String extraEnd(String str) {

	String lastTwoChars = str.substring(str.length() - 2);

	StringBuilder stringBuilder = new StringBuilder(lastTwoChars);

	int i = 0;
	while (i < 2) {

	    stringBuilder.append(lastTwoChars);

	    i = i + 1;
	}

	return stringBuilder.toString();
    }

    public String firstTwo(String str) {

	String firstTwoChars = str.length() > 2 ? str.substring(0, 2) : str;

	return firstTwoChars;

    }

    public String firstHalf(String str) {

	String evenLength = str.substring(0, str.length() / 2);

	return evenLength;
    }

    public String withoutEnd(String str) {

	String noFirstEnd = str.substring(1, str.length() - 1);

	return noFirstEnd;

    }

    public String comboString(String a, String b) {

	StringBuilder sb = null;
	if (a.length() > b.length()) {
	    sb = new StringBuilder(a);
	    sb.insert(0, b).append(b);
	} else {
	    sb = new StringBuilder(b);
	    sb.insert(0, a).append(a);
	}
	return sb.toString();

    }
    
    public String nonStart(String a, String b) {
	
	String join =a.substring(1).concat(b.substring(1));
	
	return join;
    }


}
