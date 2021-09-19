package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// maximum element in 2d array:
    int[][] arr = {{45,78,56,44},{23,42,78,90},{12,23,56},{90,89,49}};
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
