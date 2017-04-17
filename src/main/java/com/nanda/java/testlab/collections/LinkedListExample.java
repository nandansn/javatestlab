/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.nanda.java.testlab.entity.Book;

/**
 * @author Nandakumar 13-Apr-2017
 *
 *
 *         A linked list is a sequence of data structures, which are connected
 *         together via links.
 * 
 *         Linked List is a sequence of links which contains items. Each link
 *         contains a connection to another link. Linked list is the second
 *         most-used data structure after array.
 * 
 *         Linked List contains a link element called first.
 * 
 *         Each link carries a data field(s) and a link field called next.
 * 
 *         Each link is linked with its next link using its next link.
 * 
 *         Last link carries a link as null to mark the end of the list.
 * 
 *         LinkedList internally uses doubly linked list to store the elements.
 * 
 *         Manipulation with LinkedList is faster than ArrayList because it uses
 *         doubly linked list so no bit shifting is required in memory.
 * 
 *         LinkedList class can act as a list and queue both because it
 *         implements List and Deque interfaces.
 * 
 *         LinkedList is better for manipulating data.
 * 
 *         ArrayList internally uses dynamic array to store the elements.
 * 
 *         ArrayList class can act as a list only because it implements List
 *         only.
 * 
 *         ArrayList is better for storing and accessing data.
 *         
 *         Where to use the Linked List?
 *         	When there is shift operation in the middle of the list.
 *         
 *         Linked List is doubly linked list.
 *         
 *         Default size specification is not allowed
 *         
 *         Underlying Data Structure
 *         	Doubly Linked List
 *              Insertion Order
 *              Duplicates allowed
 *              Hetrogeneous Object allowed
 *              null
 *              
 *        Linked List stack and queue operations:
 *        	      
 */

public class LinkedListExample {

    public static void main(String[] args) {

	LinkedList<Book> books = new LinkedList<Book>();

	// adding element
	books.add(new Book("Java"));
	books.add(new Book("Spring"));
	books.add(new Book("Hibernate"));

	// traversing the list
	for (Book book : books)
	    System.out.println(book.toString());

	// insert first
	books.addFirst(new Book("TestNG"));

	for (Book book : books)
	    System.out.println(book.toString());

	// insert last
	books.addLast(new Book("JavaScript"));

	for (Book book : books)
	    System.out.println(book.toString());

	// get the first element
	System.out.println(books.peek());

	// pushing the book to the stack
	books.push(new Book(".net"));

	System.out.println("***************");
	for (Book book : books)
	    System.out.println(book.toString());

	// pop out from the stack
	books.pop();
	System.out.println("***************");
	for (Book book : books)
	    System.out.println(book.toString());

    }

}
