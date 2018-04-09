package com.arrays;

/** 
 * Given an int array, move all zeroes to -
 * a) End of the array
 * b) Start of the array
 * @author ashish
 *
 */

public class MoveZeroesProblem {
	// Approach 1: This is short but involves n writes.
	static void moveZeroesToEnd(int[] a) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0)
				a[count++] = a[i];
		}
		
		while(count < a.length) 
			a[count++] = 0;
	}

	// Approach 2: This is optimized and involves less no of writes
	static void moveZeroesToEnd2(int[] a) {
	  if(a.length == 0)
	    return;
	
	  int temp=0;
	  
	  for(int i=0, j = a.length - 1; i<j; ) {
	    if(a[i] == 0 && a[j] != 0) {
		      temp = a[i];
		      a[i] = a[j];
		      a[j] = temp;
		      i++;
		      j--;
	    } else if(a[i] == 0 && a[j]==0){
	    	j--;
	    } else if(a[i] != 0 && a[j] == 0) {
	    	i++;
	    	j--;
	    } else {
	    	i++;
	    }
	  }
	}
	
	// Approach 2: This is optimized and involves less no of writes
	static void moveZeroesToStart(int[] a) {
	  if(a.length == 0)
	    return;
	
	  int temp=0;
	  
	  for(int i=0, j = a.length - 1; i<j; ) {
	    if(a[i] == 0 && a[j] != 0) {
		      i++;
		      j--;
	    } else if(a[i] == 0 && a[j]==0){
	    	i++;
	    } else if(a[i] != 0 && a[j] == 0) {
	    	temp = a[i];
	    	a[i] = a[j];
	    	a[j] = temp;
	    	i++;
	    	j--;
	    } else {
	    	j--;
	    }
	  }
	}
	
}
