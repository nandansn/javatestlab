/**
 * 
 */
package com.nanda.java.testlab.oops;

import com.nanda.java.testlab.oops.B;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         NoClassFoundException - found during compile time
 * 
 *         Below Exception found during run time. Simulated by deleting the
 *         class file from the targeted folder.
 * 
 *         Exception in thread "main" java.lang.NoClassDefFoundError:
 *         com/nanda/java/testlab/oops/B at
 *         com.nanda.java.testlab.oops.NoClassDefErrorExample.main(NoClassDefErrorExample.java:15)
 *         Caused by: java.lang.ClassNotFoundException:
 *         com.nanda.java.testlab.oops.B at
 *         java.net.URLClassLoader.findClass(Unknown Source) at
 *         java.lang.ClassLoader.loadClass(Unknown Source) at
 *         sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source) at
 *         java.lang.ClassLoader.loadClass(Unknown Source) ... 1 more
 *
 * 
 */
public class NoClassDefErrorExample {

    public static void main(String... args) {

	B b = new B();
    }

}
