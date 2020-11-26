package com.durg.HelloBen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] arr_A = br.readLine().split(" ");
        for(int i_A = 0; i_A < N; i_A++) {
        	A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int out_ = Solve(N, A);
        System.out.println(out_);
       System.out.println(TestClass.Solve(N, A)); 

         wr.close();
         br.close();
    }
static int Solve(int N, int[] A){
        int i,min=0;
        for(i=0;i<N;i++){
            if(A[i]<A[i+1]){
                min=A[i];
            }else {

                 min=A[i+1];
            }
        }
            
    
        return min;
    } 
}
