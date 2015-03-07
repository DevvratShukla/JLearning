package io.github.devvratplus.java.concepts.core;

public class UnderstandingMultiDimentionalArrays {

	public static void main(String[] args) {

		//example of a int type multi-dimensional array
		int[][] grid = {
				{1,2,3},
				{4,5,6,7},
				{8,9},
				{10,11,12,13,14},
				{15,16,17}
		};
		
		//printing a int type multi-dimensional array
		for(int row=0;row<grid.length;row++){
			for(int col=0;col<grid[row].length;col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//example of a String type multi-dimensional array
		String[][] veg = new String[2][];
		veg[0] = new String[4];
		veg[1] = new String[2];
		
		veg[0][0] = "Apple";
		veg[0][1] = "Pineapple";
		veg[0][2] = "Grapes";
		veg[0][3] = "Dragonfruit";
		
		veg[1][0] = "Banana";
		veg[1][1] = "Kiwi";
		
		//printing a String type multi-dimensional array
		for(int row=0;row<veg.length;row++){
			for(int col=0;col<veg[row].length;col++){
				System.out.print(veg[row][col] + "\t");
			}
			System.out.println();
		}
				
	}

}
