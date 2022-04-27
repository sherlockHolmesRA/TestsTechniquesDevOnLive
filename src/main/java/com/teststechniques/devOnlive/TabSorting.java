package com.teststechniques.devOnlive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class TabSorting {
	
	public static void sortTable(int[] tab, boolean chooseAscOrDesc) {
		

		if (chooseAscOrDesc == true) {
			//tab = triAsc(tab);
			Arrays.sort(tab);
			System.out.println(Arrays.toString(tab));
		} else {
			//tab = triDesc(tab);
			int[] sorted = IntStream.of(tab)
			        .boxed()
			        .sorted(Comparator.reverseOrder())
			        .mapToInt(i -> i)
			        .toArray();
			System.out.println(Arrays.toString(sorted));
		}
		
	}
	public static void sortTable2(int[] tab) {
	/*
	System.out.println(Arrays.toString(tab));
	
	int[] sorted = IntStream.of(tab)
	        .boxed()
	        .sorted(Comparator.reverseOrder())
	        .mapToInt(i -> i)
	        .toArray();
	        
	        
	System.out.println(Arrays.toString(tab));
	*/
	
	List<Integer> slist = Arrays.asList(4,5,1,2,8,9,6);  
    Collections.sort(slist);      
    System.out.println("After Sorting: "+ slist);
	}
	
	/*
	 * static int[] triAsc(int[] t) {
		int k = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = i; j < t.length; j++) {
				if (t[i] > t[j]) {
					k = t[j];
					t[j] = t[i];
					t[i] = k;
				}
			}
		}
		return t;
	}

	static int[] triDesc(int[] t) {
		int k = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = i; j < t.length; j++) {
				if (t[i] < t[j]) {
					k = t[j];
					t[j] = t[i];
					t[i] = k;
				}
			}
		}
		return t;
	}
*/
	

}
