/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 16-Apr-2017
 * 
 *         Multi-Tasking: - Process-based multitasking. Independent of each
 *         other. OS level processing. Example Editing the file. - Process -1
 *         Playing songs. Process -2 Downloading file from net. -Process -3
 * 
 *         - Thread-based multitasking. Program based multi-tasking. Executing
 *         independent tasks of same program simultaneously is callled multi
 *         tasking.
 * 
 *         Example: buyer creation - Thread -1 seller creation - Thread -2
 * 
 *         Adding cc to the buyer. - Thread -1.1 Adding cc to seller. Thread 1.2
 * 
 *         Order of thread execution is not guaranteed.
 * 
 *         ThreadScheduler: Responsible to scheduling the thread. This is done
 *         by JVM.
 * 
 *         Thread class implements Runnable interface.
 * 
 *         Implementing Runnable is preferred because java supports implementing
 *         multiple interfaces. If you extend Thread class, you can’t extend any
 *         other classes.
 * 
 *         Each thread starts in a separate call stack. Invoking the run()
 *         method from main thread, the run() method goes onto the current call
 *         stack rather than at the beginning of a new call stack.
 * 
 * 
 *         Priority of a Thread (Thread Priority):
 * 
 *         Each thread have a priority. Priorities are represented by a number
 *         between 1 and 10. In most cases, thread schedular schedules the
 *         threads according to their priority (known as preemptive scheduling).
 *         But it is not guaranteed because it depends on JVM specification that
 *         which scheduling it chooses. 3 constants defiend in Thread class:
 * 
 *         public static int MIN_PRIORITY public static int NORM_PRIORITY public
 *         static int MAX_PRIORITY Default priority of a thread is 5
 *         (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of
 *         MAX_PRIORITY is 10.
 * 
 * 
 *         Java has a special kind of thread called daemon thread.
 * 
 *         Very low priority. Only executes when no other thread of the same
 *         program is running. JVM ends the program finishing these threads,
 *         when daemon threads are the only threads running in a program. What
 *         are daemon threads used for?
 * 
 *         Normally used as service providers for normal threads. Usually have
 *         an infinite loop that waits for the service request or performs the
 *         tasks of the thread. They can’t do important jobs. (Because we don't
 *         know when they are going to have CPU time and they can finish any
 *         time if there aren't any other threads running. )
 * 
 *         A typical example of these kind of threads is the Java garbage
 *         collector.
 * 
 *         There's more...
 * 
 *         You only call the setDaemon() method before you call the start()
 *         method. Once the thread is running, you can’t modify its daemon
 *         status. Use isDaemon() method to check if a thread is a daemon thread
 *         or a user thread.
 * 
 * 
 * 
 *
 * 
 */
public class ThreadingExample {

    public static void main(String[] args) { // Main is a thread which will be
					     // started by jvm.

	MyThread myThreadOne = new MyThread("ThreadOne"); // Creating child
							  // thread one.
	myThreadOne.start(); // This will be created in main call stack

	MyThread myThreadTwo = new MyThread("ThreadTwo"); // Creating child
							  // thread two.
	myThreadTwo.start();

	/******************************* Runnable ****************************/

	MyRunnable childOne = new MyRunnable("Child one Runnbale");
	childOne.run();

	MyRunnable childTwo = new MyRunnable("Child two Runnbale");
	childTwo.run();

	MyRunnable childThree = new MyRunnable("Child three runnable");

	Thread t1 = new Thread(childThree);
	t1.start();

    }

}
