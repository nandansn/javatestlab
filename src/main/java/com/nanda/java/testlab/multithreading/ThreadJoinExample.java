/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 *
 *
 *         public final void join(): This java thread join method puts the
 *         current thread on wait until the thread on which it’s called is dead.
 *         If the thread is interrupted, it throws InterruptedException.
 *
 *         public final synchronized void join(long millis): This java thread
 *         join method is used to wait for the thread on which it’s called to be
 *         dead or wait for specified milliseconds. Since thread execution
 *         depends on OS implementation, it doesn’t guarantee that the current
 *         thread will wait only for given time.
 * 
 *         public final synchronized void join(long millis, int nanos): This
 *         java thread join method is used to wait for thread to die for given
 *         milliseconds plus nanoseconds.
 */
public class ThreadJoinExample {

    public static void main(String[] args) {

	CreateUserThread createUser = new CreateUserThread();

	Thread threadOne = new Thread(createUser);
	threadOne.start();

	DownloadFileThread downLoadFile = new DownloadFileThread();

	Thread threadTwo = new Thread(downLoadFile);

	CreateUserThread createUser2 = new CreateUserThread();

	Thread threadThree = new Thread(createUser2);

	try {
	    threadOne.join(); // start second third only after thread one is
			      // dead.
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	threadTwo.start();

	try {
	    threadTwo.join(500); // start the third thread after thread two is
				 // dead or after 500 ms.
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	threadThree.start();
    }

}
