/*
Write a code to perform different operations on matrix.
1. Addition
 You are given two matrices return the addition of these two matrices.
2. Multiplication
Given two matrices return the matrix multiplication of them.(Both the matrices will always be multiplicable).
3. Transpose
Given a Matrix calculate the transpose of the matrix and return it. (Number of rows and columns will be same)
4. Rotate by 90
Given a Matrix, rotate the matrix by 90 degree in anticlockwise direction.

Input format :
Line 1: Operation to be performed
Line 2 : No of rows(n1) & No of columns(m1) (separated by space)
Line 3 : Row 1 elements (separated by space)
Line 4 : Row 2 elements (separated by space)
Line 5 : and so on
(If needed)
Line n1+2 : No of rows(n2) & No of columns(m2)(separated by space)
Line n1+3 : Row 1 elements (separated by space)
Line n1+4 : Row 2 elements (separated by space)
Line n1+5 : and so on

Sample Input 1 :
1
2 2
1 2
1 3
2 2
4 3
1 5
Sample output 1 :
5 5
2 8
Sample Input 2 :
2
2 2
1 2
1 3
2 2
4 3
1 5
Sample output 2 :
6 13
7 18
Sample Input 3 :
3
2 2
1 2
1 3
Sample output 3 :
1 1
2 3
Sample Input 4 :
4
2 2
1 2
1 3
Sample output 4 :
2 3
1 1
Note : Partial marking is there, so implementation of each function will give you some marks.
*/

package Generic;

public class MatrixClass {
	 int [][] matrix;

	    mat(int [][] mat)
	    {
	        matrix=mat;
	    }


	    public static mat add(mat a,mat b)
	    {
	        if (a.matrix.length==0) return null;
	        int[][] c = new int[a.matrix.length][a.matrix[0].length];
	        for(int i=0;i<3;i++){
	            for(int j=0;j<3;j++){
	                c[i][j]=a.matrix[i][j]+b.matrix[i][j];    //use - for subtraction
	            }
	        }
	        return new mat(c);
	    }

	    public static int[][] matrixMultiplication(
	            int[][] matrix1, int rows1, int cols1,
	            int[][] matrix2, int rows2, int cols2)
	            throws Exception
	    {

	        // Required condition for matrix multiplication
	        if (cols1 != rows2) {
	            throw new Exception("Invalid matrix given.");
	        }

	        // create a result matrix
	        int resultMatrix[][] = new int[rows1][cols2];

	        // Core logic for 2 matrices multiplication
	        for (int i = 0; i < resultMatrix.length; i++)
	        {
	            for (int j = 0;
	                 j < resultMatrix[i].length;
	                 j++)
	            {
	                for (int k = 0; k < cols1; k++)
	                {
	                    resultMatrix[i][j]
	                            += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        return resultMatrix;
	    }
	    public static mat multiply(mat a,mat b){
	        if (a.matrix.length == 0||b.matrix.length==0) return null;
	        try {
	            return new mat(matrixMultiplication(a.matrix,a.matrix.length,a.matrix[0].length,b.matrix,b.matrix.length,b.matrix[0].length));
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public static mat transpose(mat m)
	    {
	        if (m.matrix.length==0) return null;
	        int[][] B = new int[m.matrix[0].length][m.matrix.length];
	        int i, j;
	        for (i = 0; i < m.matrix[0].length; i++)
	            for (j = 0; j < m.matrix.length; j++)
	                B[i][j] = m.matrix[j][i];
	        
	        return new mat(B);
	    }
	    public static mat rotate(mat m)
	    {
	        int [][] matrix = m.matrix;
	        int n = matrix.length;
	        if (n == 1) {
	            return null;
	        }
	        for (int k=0;k<3;k++){
	            for (int i = 0; i < n / 2; i++) {
	                for (int j = i; j < n - 1 - i; j++) {
	                    int temp = matrix[i][j];
	                    matrix[i][j] = matrix[n - 1 - j][i];
	                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
	                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
	                    matrix[j][n - 1 - i] = temp;
	                }
	            }
	        }
	        return new mat(matrix);
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
}