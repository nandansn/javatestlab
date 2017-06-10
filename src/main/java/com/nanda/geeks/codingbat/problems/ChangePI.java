/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

/**
 * @author Nandakumar 
 * 08-Jun-2017
 *
 */
public class ChangePI {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//new ChangePI().changePi("xpixpi");
	
	//System.out.println(new ChangePI().noX("abc"));
	System.out.println(new ChangePI().array220(new int[]{20,6,1,10},0));
	
	

    }
    
    public String changePi(String str) {
	
	str = str.replace("pi", "3.14");
	str = changePi(str);
	return str;
	  
    }
    
    public String noX(String str) {
	
	str = str.replace("x", "");
	
	return str;
	  
    }
    
    public boolean array6(int[] nums, int index) {
	
	boolean flag = false;
	
	if(nums.length == 0)
	    return flag;
	
	if(nums[index] == 6){
	    flag = true;
	    return flag;
	}else{
	    int length = nums.length-1;
	    ++index;
	    if(index <= length){
		flag = array6(nums,index);
	    }else{
		return flag;
	    }
	}
	
	return flag;
	  
    }

    public int array11(int[] nums, int index) {
	
	int count =0;
	
	if(nums.length == 0)
	    return 0;
	
	if(nums[index] == 11){
	    
	    count = count +1;
	    ++index;
	    if(index <= nums.length-1){
		
		count = count + array11(nums,index);
	    }else{
		return count;
	    }
	}else{
	    ++index;
	    if(index <= nums.length-1){
		
		count = count + array11(nums,index);
	    }else{
		return count;
	    }
	}
	
	return count;
    }
    
    
    public boolean array220(int[] nums, int index) {
	
	boolean flag = false;
	
	if(nums.length <2)
	    return false;
	
	if(index == 0){
	    ++index;
	}
	
	if(nums[index]%10 ==0 && nums[index-1] == nums[index]/10){
	    flag = true;
	    return flag;
	}else{
	    ++index;
	    if(index <= nums.length-1){
		flag = array220(nums,index);
	    }else{
		return flag;
	    }
	}
	
	return flag;
	  
    }

}
