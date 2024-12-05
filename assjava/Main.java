

import java.util.*;

class Matrix {
    private double data[][];
    
    private int rows;
    private int cols;
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                this.data[i][j] = data[i][j];
    }
    public void setElement(int row, int col, double value) {
    if (row >= 0 && row < rows && col >= 0 && col < cols) {
        data[row][col] = value;
    } else {
        throw new IndexOutOfBoundsException("Invalid row or column index.");
    }
}

  
    public Matrix transpose() {
        Matrix transposed = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed.data[j][i] = this.data[i][j];
            }
        }
        return transposed;
    }

  
    public Matrix add(Matrix m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    public static Matrix addition(Matrix m1, Matrix m2) {
        return m1.add(m2);
    }

  
    public Matrix sub(Matrix m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction.");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - m.data[i][j];
            }
        }
        return result;
    }

    public static Matrix subtraction(Matrix m1, Matrix m2) {
        return m1.sub(m2);
    }

  
    public Matrix mul(Matrix m) {
        if (this.cols != m.rows) {
            throw new IllegalArgumentException("Matrix dimensions incompatible for multiplication.");
        }
        Matrix result = new Matrix(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * m.data[k][j];
                }
            }
        }
        return result;
    }

    public static Matrix multiplication(Matrix m1, Matrix m2) {
        return m1.mul(m2);
    }

    public Matrix inverse() {
       
        double determinant = data[0][0] * data[1][1] - data[0][1] * data[1][0];
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot have an inverse.");
        }
        double[][] inverseData = {
            { data[1][1] / determinant, -data[0][1] / determinant },
            { -data[1][0] / determinant, data[0][0] / determinant }
        };
        return new Matrix(inverseData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : data) {
            for (double value : row) {
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter rows and columns for matrix m1: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        Matrix m1 = new Matrix(rows1, cols1);
        System.out.println("Enter values for matrix m1:");
		for (int i = 0; i < rows1; i++) {
		    for (int j = 0; j < cols1; j++) {
		        m1.setElement(i, j, scanner.nextDouble());
		    }
		}

        
        System.out.print("Enter rows and columns for matrix m2: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        Matrix m2 = new Matrix(rows2, cols2);
        System.out.println("Enter values for matrix m2:");
		for (int i = 0; i < rows2; i++) {
		    for (int j = 0; j < cols2; j++) {
		        m2.setElement(i, j, scanner.nextDouble());
		    }
		}

     
        System.out.println("\nAddition of Matrix");
        System.out.println(m1.add(m2));

        System.out.println("\nSubtraction of Matrix");
        System.out.println(m1.sub(m2));

        System.out.println("\nMultipllication of Matrix");
        System.out.println(m1.mul(m2));

        System.out.println("\nTranspose of Matrix-1");
        System.out.println(m1.transpose());

        if (rows1 == 2 && cols1 == 2) {
            System.out.println("\nInverse of Matrix-1:");
            System.out.println(m1.inverse());
        } else {
            System.out.println("Inverse of Matrix only possible in 2x2 matrices.");
        }

        scanner.close();
    }
}
