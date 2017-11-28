package com.nanda.magnitude;

public class Pair<A,B> {

	private String nodeName;
	private String parentNodeName;

	public Pair(String nodeName, String parentNodeName) {
		super();
		this.nodeName = nodeName;
		this.parentNodeName = parentNodeName;
	}

	public String getNodeName() {
		return nodeName;
	}

	public String getParentNodeName() {
		return parentNodeName;
	}

	@Override
	public String toString() {
		return "Pair [nodeName=" + nodeName + ", parentNodeName=" + parentNodeName + "]";
	}
	
	

}
