/**
 * 
 */
package com.nanda.hackerrank;

import java.util.*;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class ComparatorExample {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	Player[] player = new Player[n];
	Checker checker = new Checker();

	for (int i = 0; i < n; i++) {
	    player[i] = new Player(scan.next(), scan.nextInt());
	}
	scan.close();

	Arrays.sort(player, checker);
	for (int i = 0; i < player.length; i++) {
	    System.out.printf("%s %s\n", player[i].name, player[i].score);
	}
    }
}

class Player {

    String name;
    int score;

    /**
     * @param name
     * @param score
     */
    public Player(String name, int score) {
	this.name = name;
	this.score = score;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the score
     */
    public int getScore() {
	return score;
    }

    /**
     * @param score
     *            the score to set
     */
    public void setScore(int score) {
	this.score = score;
    }

}

class Checker implements Comparator<Player> {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Player o1, Player o2) {
	// TODO Auto-generated method stub

	if (o1.getScore() == o2.getScore()) {
	    return o1.getName().compareToIgnoreCase(o2.getName());
	} else if (o1.getScore() > o2.getScore()) {
	    return -1;
	} else {
	    return 1;
	}

    }

}