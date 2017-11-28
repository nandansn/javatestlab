package com.nanda.magnitude;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class CyclicDependencyScanner {

	public static boolean findCyclicDependency(List<Pair<String, String>> inputs) {

		Set<String> treeSet = new TreeSet();

		for (ListIterator iterator = inputs.listIterator(); iterator.hasNext();) {
			Pair<String, String> pair = (Pair<String, String>) iterator.next();

			if (treeSet.size() > 0) {

				if (treeSet.contains(pair.getParentNodeName())) {
					if (treeSet.contains(pair.getNodeName())) {
						return true;
					} else {
						treeSet.add(pair.getNodeName());
					}
				}

			} else {

				treeSet.add(pair.getParentNodeName());
				boolean childAddFlag = treeSet.add(pair.getNodeName());

				if (!childAddFlag) {
					return true;
				}
			}

		}

		return false;
	}

}
