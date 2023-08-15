package 행렬_POCU;

import java.util.Arrays;

public class 행렬02_연산 {
    public static void main(String[] args){
        int[][] matrixA = {{5,5}, {5,5}, {5,5}};
        int[][] matrixB = {{5,5,5}, {5,5,5}};
        int[] vector = {5,5};
        //identity matrix
        //행번호와 열번화가 동일한 요소 값이 1
        //나머지 요소의 값이 0
        int[][] matrixC = {{1,0}, {0,1}};
        multifyScalarAndMatrix(matrixA, 2);
        addMatrixAndMatrix(matrixA, matrixB);
        transposeMatrix(matrixA);
        multifyMatrixAndMatrix(matrixA, matrixB);
        multifVectorAndMatrix(vector, matrixC);

    }
    //행렬 X 스칼라
    static void multifyScalarAndMatrix(int matrix[][], int scalar){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = matrix[i][j] * scalar;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    //행렬 + 스칼라


    static void addMatrixAndMatrix(int matrixA[][], int matrixB[][]){
        if(matrixA.length != matrixB.length || matrixA[0].length != matrixB.length)
            return;
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                matrixA[i][j] = matrixA[i][j] +  matrixB[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrixA));
    }

    //전치행렬
    //행과 열 교환
    static void transposeMatrix(int matrixA[][]){

        int[][] transposedMatrix = new int[matrixA[0].length][matrixA.length];
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                transposedMatrix[j][i] = matrixA[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transposedMatrix));
    }
    //행렬 A 행 X 행렬 B열 -> 행렬 곱 규칙
    static void multifyMatrixAndMatrix(int matrixA[][], int matrixB[][]){
        System.out.println("matrixA : " + Arrays.deepToString(matrixA) +
                "matrixB : " + Arrays.deepToString(matrixB));
        int resultMatrix[][] = new int[matrixA.length][matrixA[0].length];

        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                for(int k=0; k<matrixA.length; k++){
                    resultMatrix[i][j] += (matrixA[k][j] * matrixB[j][k]);
                }
            }
        }
        System.out.println(Arrays.deepToString(resultMatrix));

    }


    static void multifVectorAndMatrix(int vector[], int matrix[][]){
        int resultVector[] = new int[vector.length];

        for(int i=0; i<vector.length; i++){
            for(int j=0; j<vector.length; j++){
                resultVector[i] += (matrix[i][j] * vector[j]);
            }
        }
        System.out.println(Arrays.toString(resultVector));

    }
}



