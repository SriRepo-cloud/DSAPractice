package com.dsa.practice.sorting;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = { 2, 4, 5, 8, 6 };
		int result = bubbleSort(nums, 7);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else
			System.out.println("Element not found");
	}

	private static int bubbleSort(int[] nums, int i) {
		// TODO Auto-generated method stub
		return -1;
	}
}
