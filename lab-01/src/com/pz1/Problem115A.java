package com.pz1;

import java.util.Scanner;

public class Problem115A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Scan number of employees
        int n = sc.nextInt();

        // Array for links between employees and superiors
        int[] superiors = new int[n];
        int temp;
        for(int i = 0; i < n; i++){
            temp = sc.nextInt();
            if(temp == -1) superiors[i] = temp;     // Handle input indexed from 1
            else superiors[i] = temp - 1;
        }
        int maxNumber = 0;

        // Trace the route of each node to the root
        for(int i = 0; i < n; i++){
            maxNumber = Math.max(maxNumber, findNumberOfSuperiors(i, superiors));
        }

        System.out.println(maxNumber);
    }

    private static int findNumberOfSuperiors(int current, int[] superiors){
        int n = 1;

        while(superiors[current] != -1){
            n++;
            current = superiors[current];
        }
        return n;
    }
}