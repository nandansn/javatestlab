/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 * 
 *         New
 * 
 *         When we create a new Thread object using new operator, thread state
 *         is New Thread. At this point, thread is not alive and it’s a state
 *         internal to Java programming.
 * 
 *         Runnable
 * 
 *         When we call start() function on Thread object, it’s state is changed
 *         to Runnable. The control is given to Thread scheduler to finish it’s
 *         execution. Whether to run this thread instantly or keep it in
 *         runnable thread pool before running, depends on the OS implementation
 *         of thread scheduler.
 * 
 *         Running
 * 
 *         When thread is executing, it’s state is changed to Running. Thread
 *         scheduler picks one of the thread from the runnable thread pool and
 *         change it’s state to Running. Then CPU starts executing this thread.
 *         A thread can change state to Runnable, Dead or Blocked from running
 *         state depends on time slicing, thread completion of run() method or
 *         waiting for some resources.
 * 
 *         Blocked/Waiting
 * 
 *         A thread can be waiting for other thread to finish using thread join
 *         or it can be waiting for some resources to available. For example
 *         producer consumer problem or waiter notifier implementation or IO
 *         resources, then it’s state is changed to Waiting. Once the thread
 *         wait state is over, it’s state is changed to Runnable and it’s moved
 *         back to runnable thread pool.
 * 
 *         Dead
 * 
 *         Once the thread finished executing, it’s state is changed to Dead and
 *         it’s considered to be not alive.
 *
 */
public class ThreadLifeCycle {

}
