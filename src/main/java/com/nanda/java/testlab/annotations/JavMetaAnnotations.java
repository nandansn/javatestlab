/**
 * 
 */
package com.nanda.java.testlab.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         Java Meta Annotations:
 * @Inherited
 * @Documented
 * @Target
 * @Retention
 *
 * @Inherited Annotation by default not inherited. Means annotation used in base
 *            class is not inherited in the child class. To inherit the base
 *            class annotation we need to use @Inherited
 * 
 * @Documented By default annotations are not documented by javadoc tool. When
 *             we apply @Documented then document will be generated for this
 *             annotation.
 * 
 * @Target apply annotations for local var, methods, constructors, classes,
 *         packages, interface, annotations
 * 
 *         ElementType.Type -> class, abstract class, interface
 *         ElementType.Field -> variable ElementType.METHOD -> methods
 *         ElementType.CONSTRUCTORS -> construtors.
 * 
 * @Retention A retention policy determines at what point annotation should be
 *            discarded. 
 *            Java defined 3 types of retention policies through
 *            java.lang.annotation.RetentionPolicy enumeration. 
 *            It has SOURCE,
 *            CLASS and RUNTIME. 
 *            Annotation with retention policy SOURCE will be
 *            retained only with source code, and discarded during compile time.
 *            Annotation with retention policy CLASS will be retained till
 *            compiling the code, and discarded during runtime. Annotation with
 *            retention policy RUNTIME will be available to the JVM through
 *            runtime. 
 *            The retention policy will be specified by using java
 *            built-in annotation @Retention, and we have to pass the retention
 *            policy type. The default retention policy type is CLASS. - See
 *            more at:
 *            http://www.java2novice.com/java-annotations/retention-policy/#sthash.bZJSldrR.dpuf
 */
public class JavMetaAnnotations {

}

@Store
class Employee {
    
   

}
@Store
class Manager extends Employee {

    @Store
    public void display(){
	
    }
}

@Inherited // now the store annotation will be available in child class as well.
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Store {

}
