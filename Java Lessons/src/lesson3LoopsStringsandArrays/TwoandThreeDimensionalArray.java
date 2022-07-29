package lesson3LoopsStringsandArrays;

public class TwoandThreeDimensionalArray {

	public static void main(String[] args) {
		/* Syntax:
		 * data_type[1st dimension][2nd dimension][]..[Nth dimension]
		 * array_name = new data_type[size1][size2]….[sizeN];
		 * data_type = Type of data to be stored in array
		 * dimension - Dimension of Array created, e.g. 2D, 3D
		 * size1, size2, ..., sizeN - Dimension size
		 * 
		 * Two dimensional array:
		 * int[][] twoD_arr = new int[10][20];
		 * Three dimensional array:
		 * int[][][] threeD_arr = new int[10][20][30];
		 */
		
		/* Two-dimensional array
		 * Declaration:
		 * data_type[][][] array_name = new data_type[x][y];
		 * For example: int[][][] arr = new int[10][20];
		 * 
		 * Initializtion:
		 * array_name[row_index][column_index] = value;
		 * For example: arr[0][0] = 1;
		 * 
		 */
		int[][] arr = new int[10][20];
        arr[0][0] = 1; // represent element present in first row and first column
  
        System.out.println("arr[0][0] = " + arr[0][0]);
        
        /*Three-dimensional array
         * Declaration:
         * data_type[][][] array_name = new data_type[x][y][z];
         * For example: int[][][] arr = new int[10][20][30];
         * 
         * array_name[array_index][row_index][column_index] = value;
         * For example: arr[0][0][0] = 1;
         * 
         */
        int[][][] arr1 = new int[10][20][30];
        arr1[0][0][0] = 1;
  
        System.out.println("arr1[0][0][0] = " + arr1[0][0][0]);
	}

}
