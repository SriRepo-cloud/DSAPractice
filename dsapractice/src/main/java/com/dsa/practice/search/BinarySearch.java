package com.dsa.practice.search;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 5, 7, 8 };

		int result = binarySearch(nums, 11);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else
			System.out.println("Element not found");
	}

	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

}
