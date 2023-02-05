package com.gl.gradedproject.question1;

public class displayArray {
	void displayarray(int a[]){
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}

}
/*for (int i = 0; i < arr.length; i++) {
	if (arr[i]==arr1[j]) {
		System.out.println("Day :" + (i + 1));
		System.out.println(arr1[i]);
	} else if (arr[i]<arr1[i]) {
		stack.push(arr[i]);
		System.out.println("Day :" + (i + 1));
		System.out.println(" ");
		continue;
	} else if (arr[i]>arr1[i]) {
		stack.push(arr[i]);
		System.out.println("Day :" + (i + 1));
	} while (arr[i]>arr1[i]  && !stack.isEmpty()){
			val=stack.pop();
		System.out.print(" " +val);
		}
	}*/