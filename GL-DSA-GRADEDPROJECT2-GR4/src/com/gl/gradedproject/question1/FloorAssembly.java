package com.gl.gradedproject.question1;

import java.util.Scanner;
import java.util.Stack;

public class FloorAssembly {

	public static void main(String[] args) {
		int totalFloor;
		int floorSize;
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of floors in the building");
		totalFloor = sc.nextInt();
		int arr[] = new int[totalFloor];
		int arr1[] = new int[totalFloor];

		for (int i = 0; i < totalFloor; i++) {
			System.out.println("Enter the floor size given on day: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The floor size on day " + (i + 1) + " is " + arr[i]);
		}

		displayArray da = new displayArray();
		da.displayarray(arr);

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}

		for (int i = 0; i < arr1.length; i++) {
			int largest = i;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[largest] < arr1[j]) {
					largest = j;
				}
			}
			int temp = arr1[largest];
			arr1[largest] = arr1[i];
			arr1[i] = temp;
		}

		da.displayarray(arr1);
		Stack<Integer> stack = new Stack<Integer>();
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr1[a]) {
				System.out.println("Day :" + (i + 1));
				System.out.println(" ");
				stack.push(arr[i]);
			} else if (arr[i] == arr1[a]) {
				if(i==arr.length-1)a=i;
				else a=i+1;
				System.out.println("Day: " + (i + 1));
				System.out.print(arr[i]);
				while(!stack.isEmpty()) {
				val = stack.pop();
				if (val>arr1[a] || i==arr.length-1) {
					System.out.print(val+" ");
				}
				else if (val<arr1[a]) {
					stack.push(val);
					a-=stack.size();
				break;
				}
				}
				
			}
		}

	}
}
