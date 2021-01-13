package com.ds.workshop;

import org.codehaus.jackson.map.ser.StdSerializers.NumberSerializer;

public class RainWater {

	public static void main(String[] args) {
		
		int[] nums = {3,0,2,0,4};
		
		int totalWater = 0;
		
		
		for (int i = 1; i < nums.length -1; i++) {
			
			int leftMax = findLeftmax(nums, i, 0);
			int rightMax = findRightMax(nums, i, nums.length-1);
			
			if (leftMax < rightMax) {
				totalWater = totalWater + leftMax - nums[i];
			} else {
				totalWater = totalWater + rightMax - nums[i];
			}
			
			
		}
		
		System.out.println(totalWater);
		
		

	}
	
	public static int findLeftmax(int[] nums, int currentIndex, int startPos) {
		
		int leftMax = 0;
		
		for (int i = currentIndex - 1; i >= startPos; i--) {
			
			if (nums[i] > leftMax) {
				leftMax = nums[i];
			}
			
		}
		
		
		return leftMax;
	}
	
	public static int findRightMax(int[] nums, int currentIndex, int lastPos) {
		
		int rightMax = 0;
		
		for (int i = currentIndex; i <= lastPos; i++) {
			
			if (nums[i] > rightMax) {
				rightMax = nums[i];
			}
			
		}
		
		return rightMax;
	}

}
