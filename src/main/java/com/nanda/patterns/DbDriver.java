package com.nanda.patterns;

public class DbDriver {
	
	private static DbDriver dbDriver = null;
	
	private DbDriver() {
		
	}
	
	public static DbDriver getInstance() {
		
		return dbDriver == null ? dbDriver = new DbDriver() : dbDriver;
	}

}
