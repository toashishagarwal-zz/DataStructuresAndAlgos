package com.arrays;

/** 
 * Given an int array, move all zeroes to -
 * a) End of the array
 * b) Start of the array
 * @author ashish
 *
 */

public class MoveZeroesProblem {

	public static void main(String[] args) {
		int[] a = {3,1,0,0,23,0,1,3,0,1,2};
		moveZeroesToEnd(a);
		
		for(Integer i : a)
			System.out.print(i+" ");
		
		System.out.println();
		int[] b = {3,1,2,0,0,3,1,3,0,1,2};
		moveZeroesToStart(b);
		for(Integer i : b)
			System.out.print(i+" ");
	}
	
	private static void moveZeroesToEnd(int[] a) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0)
				a[count++] = a[i];
		}
		
		while(count < a.length) {
			a[count++] = 0;
		}
	}
	
	private static void moveZeroesToStart(int[] a) {
		int temp=0;
		for(int i=0,j=a.length-1;i<j;j--) {
			if(a[i] != 0 && a[j] == 0) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
	}

}
