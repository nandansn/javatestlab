/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 * 
 *         Implementing Runnable is preferred because java supports implementing
 *         multiple interfaces. If you extend Thread class, you can’t extend any
 *         other classes.
 * 
 *         Java Thread Sleep important points
 * 
 *         It always pause the current thread execution. The actual time thread
 *         sleeps before waking up and start execution depends on system timers
 *         and schedulers. For a quiet system, the actual time for sleep is near
 *         to the specified sleep time but for a busy system it will be little
 *         bit more. Thread sleep doesn’t lose any monitors or locks current
 *         thread has acquired. Any other thread can interrupt the current
 *         thread in sleep, in that case InterruptedException is thrown.
 * 
 *         How Thread Sleep Works
 * 
 *         Thread.sleep() interacts with the thread scheduler to put the current
 *         thread in wait state for specified period of time. Once the wait time
 *         is over, thread state is changed to runnable state and wait for the
 *         CPU for further execution. So the actual time that current thread
 *         sleep depends on the thread scheduler that is part of operating
 *         system.
 * 
 *         After starting a thread, it can never be started again. If you does
 *         so, an IllegalThreadStateException is thrown. In such case, thread
 *         will run once but for second time, it will throw exception.
 *
 */
public class ThreadSleep {

    public static void main(String[] args) {

	CreateUserThread createUser = new CreateUserThread();

	Thread threadOne = new Thread(createUser);
	System.out.println(threadOne.getName());
	threadOne.setName("User Creation");
	threadOne.start();
	System.out.println(threadOne.getName());

	DownloadFileThread downLoadFile = new DownloadFileThread();

	Thread threadTwo = new Thread(downLoadFile);
	threadTwo.setName("File Download");
	threadTwo.start();
	threadTwo.start(); // calling start method twice will throw IllegalThreadStateException.

    }

}
