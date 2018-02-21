package com.numbers;

import java.util.TreeSet;

public class PrintRCombinations {
	static int[] temp = new int[50];
	static TreeSet<Integer> set = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		int[] arr ={1,2,3,4};
		int k=2;
		getCombos(arr,0,arr.length,k,0);
		int maxEnergy = set.last();
		System.out.println(maxEnergy);
	}
	
	static void getCombos(int a[],int i,int N,int k,int index) {
		int j;
		if(k==index){
			for(i=0;i<k;i++)
				System.out.print(temp[i]+" ");
			System.out.println();
			int energy = getEnergy(temp, k);
			set.add(energy);
			return;
		}
		for(j=i;j<N;j++){
			temp[index]=a[j];
			getCombos(a,j+1,N,k,index+1);
		}
	}

	private static int getEnergy(int[] t, int k) {
		int sum=0;
		for(int i= k-1 ; i>0 ;i-- ) {
			sum += (t[i] - t[i-1]);
		}
		
		return sum;
	}

}
