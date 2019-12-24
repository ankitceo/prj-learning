package util;

public class PuzzleChecker {

	public static void main(String[] args) {
		int[][] arr1 =  {{13,2,10,3}, {1,12,8,4}, {5,0,9,6}, {15,14,11,7}};
		int[][] arr2 =  {{6,13,7,10}, {8,9,11,0}, {15,2,12,5}, {14,3,1,4}};
		int[][] arr3 =  {{3,9,1,15}, {14,11,4,6}, {13,0,10,12}, {2,7,8,5}};
		int[][] arr4 =  {{1,8,2}, {0,4,3}, {7,6,5}};
		System.out.println("arr1 Solvable: " + solve(arr1));
		System.out.println("arr2 Solvable: " + solve(arr2));
		System.out.println("arr3 Solvable: " + solve(arr3));
		System.out.println("arr4 Solvable: " + solve(arr4));
	}
	
	public static boolean solve(int[][] arr) {
		int[] a = new int[arr.length * arr.length];
		int count = 0;
		boolean isEven = false;
		System.out.println("Given Array:");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				a[count] = arr[i][j];
				count++;
				if(arr[i][j] == 0 && i % 2 == 0) {
					isEven = true;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("1D Array:");
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				System.out.print("{");
			}
			System.out.print(a[i]);
			if(i != a.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print("}");
			}
		}
		System.out.println();
		
		System.out.println("Position is Even: " + isEven);
		
		int inv = 0;
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] != 0 && a[j] != 0 && a[i] > a[j]) {
					inv++;
				}
			}
		}
		System.out.println("Inversion: " + inv);
		
		if((isEven && inv % 2 != 0) || (!isEven && inv % 2 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
