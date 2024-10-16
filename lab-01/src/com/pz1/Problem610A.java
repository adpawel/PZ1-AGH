package com.pz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem610A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // Array for string representation
        List<int[]> extendedSolutions = new ArrayList<>();

        // Calculate number of solutions
        int result = calculateOutput(n, extendedSolutions);
        System.out.print("Result: " + result);
        for(int[] list : extendedSolutions){
            System.out.print(", {" + list[0] + ", " + list[0] + ", " + list[1] + ", " + list[1] + "}");
        }
    }

    public static int calculateOutput(int n, List<int[]> solutions) {
        // For odd numbers cannot create rectangle
        if(n % 2 == 1){
            return 0;
        }

        int j;
        int result = 0;
        for(int i = 1; i <= n/4; ++i){
            j = n/2 - i;
            if(i != j){
                result++;
                solutions.add(new int[]{i, j});
            }
        }
        return result;
    }
}
