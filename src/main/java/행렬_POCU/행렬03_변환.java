package 행렬_POCU;

import java.util.Arrays;

public class 행렬03_변환 {
    public static void main(String[] args){
        //사각형정보
        int squareVector[][] = {
                {-1,1},
                {1,1},
                {-1,-1},
                {1,-1}
        };
        //2배 확대
        int[][] scaleMatrix ={
            {2,0},
            {0,2}
        };
        for(int vector[] : squareVector){
            multifVectorAndMatrix(vector, scaleMatrix);
        }


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
