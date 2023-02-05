package com.online.runprogram;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {
	public static void main(String[] args) {
		
int ar[]={4,5,1,2,3};
for(int no:ar) {
	System.out.print(no+" ");
}
int[] arraysorted = ar.clone();
Arrays.sort(arraysorted, Collections.reverseOrder());
System.out.println("  ");
for(int no1:arraysorted) {
	System.out.print(no1+" ");
}
}
}