package com.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** Facebook Q
 * 
 * Given an input stream of n integers the task is to insert integers to stream 
 * and print the median of the new stream formed by each insertion of x to the stream.
 * 
 * @author ashish
 *
 */

public class MedianStreams {

	public static void main (String[] args) {
		int[] temp = {5,10,4,3};
		
        ArrayList<Integer> stream = new ArrayList<Integer>();
        for(int i=0;i< temp.length;i++) {
            stream.add(temp[i]);
            System.out.println(median(stream));
        }
    }

   	static int median(List<Integer> a) {
		Collections.sort(a);
		int size = a.size();
		
		if(size % 2 == 0)
			return (a.get(size / 2) + a.get((size / 2) -1)) / 2;
		else
			return a.get(size / 2);
	}
}
