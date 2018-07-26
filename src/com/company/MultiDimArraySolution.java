package com.company;

public class MultiDimArraySolution {
    public static void main(String [] args){
        //Makes and Prints rows and cols
        String[][] rowCol=new String[5][10];
        for(int r=0;r<5;r++){
            System.out.println();
            for(int c=0;c<10;c++){
                rowCol[r][c]="row: "+(r+1)+" col: "+(c+1);
                System.out.print(rowCol[r][c]+"\t");
            }
        }

        //Makes and prints times table up to 12
        int[][] timesTable=new int[12][12];
        for(int r=0;r<12;r++){
            System.out.println();
            for(int c=0;c<12;c++){
                timesTable[r][c]=(r+1)*(c+1);
                System.out.print(timesTable[r][c]+"\t");
            }
        }
    }
}
