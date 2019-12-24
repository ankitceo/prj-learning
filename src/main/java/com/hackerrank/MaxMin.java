package com.hackerrank;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = {5, 8, 6, 4, 2, 3, 1, 4};
		int k = 5;
		/*for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }*/
		
		mergesort(arr, 0, arr.length - 1);
		
		/*for(int num : arr) {
			System.out.println(num);
		}*/
		
		int diff = arr[k-1] - arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(k-1+i < arr.length && (arr[k-1+i] - arr[i]) < diff) {
                diff = arr[k-1+i] - arr[i];
            }
        }
        System.out.println(diff);
	}
	
	public static int[] mergesort(int[] a, int l, int r) {
		if(l < r) {
			int m = l/2 + r/2;
			mergesort(a, l, m);
			mergesort(a, m+1, r);
			merge(a, l, m, r);
		}
		return a;
	}
	
	public static int[] merge(int[] a, int l, int m, int r) {
		int i = 0, j = 0, k = 0;
		int[] left = new int[m - l + 1];
		int[] right = new int[r - m];

		for(k = l; k <= r; k++) {
			if(k <= m) {
				left[i] = a[k];
				i++;
			} else {
				right[j] = a[k];
				j++;
			}
		}
		
		i = j = k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				a[l + k] = left[i];
				i++;
			} else {
				a[l + k] = right[j];
				j++;
			}
			k++;
		}

		while(i < left.length) {
			a[l + k] = left[i];
			i++;
			k++;
		}
		while(j < right.length) {
			a[l + k] = right[j];
			j++;
			k++;
		}
		
		return a;
	}

}
