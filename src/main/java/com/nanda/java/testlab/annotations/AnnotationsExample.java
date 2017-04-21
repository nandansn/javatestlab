/**
 * 
 */
package com.nanda.java.testlab.annotations;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         Java Annotation is a tag that represents the metadata i.e. attached
 *         with class, interface, methods or fields to indicate some additional
 *         information which can be used by java compiler and JVM.
 * 
 *         Built-In Java Annotations used in java code
 * 
 * @Override : To indicate that we are overiding the superclass method. if make
 *           any spell mistakes are not overriding the superclass methods.
 *           compiler will throw an error.
 * @SuppressWarnings : Used to suppress the warnings issued by compiler.
 * @Deprecated: annoation marks that this method is deprecated so compiler
 *              prints warning. It informs user that it may be removed in the
 *              future versions.
 * 
 *              Built-In Java Annotations used in other annotations
 * 
 * @Target
 * @Retention
 * @Inherited
 * @Documented
 * 
 * Ref: https://www.youtube.com/watch?v=4vROZsBz7Oo&list=PLkcic9ioQcFe6qq5c2IgUEhQksE3I-QzI
 * 
 * Compiler 6 stages
 * 	lexical analysis
 * 	syntax analysis
 * 	semantic analysis
 * 	inter-mediate code gen
 * 	code optimisation
 * 	code generation
 * 	
 * comments life is upto compilation phase. during lexical analysis comments will be removed.
 *  to test our application or debug our code we need to keep our data till run time. to keep the meta-data till run time we are going for annotation.
 *  
 *  We can access the annotations programmatically. Before jdk 5 we were using xml to access the meta-data programmatically.This has reduced the coding of app configurations
 *  
 *  JDBC 4.x is annotation
 *  Servlet 3.x annotation
 *  Struts 2.x annotation
 *  JSF 2,x annotation
 *  Hibernate 3.2.5 annotation
 *  Spring 3.x annotation
 *  EJB 3.x annotation
 *  
 *  Annotations are executed by APT annotation processing tool.
 *  
 *  2 types of syntax
 *  	1. declaration syntax
 *  		@interface annotation_name{
 *  			data-type member_name()[default = value];
 *  		}
 *  	2. utilisation syntax.
 *  		variables, methods, classes
 *  		@annotaion_name(member_var1=value1,member_var2=value2)
 *  		programming elements
 *  
 *  Types of annotations:
 *  	1. Marker Annotation
 *  		annotaion without any member. example: @Override
 *  	2. Single Valued Annotation
 *  		annotation with only one member. example @SuppressWarning("unchecked") -> unchecked is the value of the data member.
 *  	3. Multi-Valued annotation.
 *  		annotation with multiple members. example @Controller(path="",method.GET)
 *
 */
public class AnnotationsExample {

}
