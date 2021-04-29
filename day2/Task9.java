package com.company.week1.day1;//Given arithmetic sequence Sn  = 3n*n - 12n
//	print the sum S10
//	print the sum S15

public class Task9 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 15;
        int s1 = 3 * n1 * n1 - (12 * n1);
        int s2 = 3 * n2 * n2 - (12 * n2);
        System.out.println("SUM10= " + "3*10*10-(12*10)=" + s1);
        System.out.println("SUM15= " + "3*15*15-(12*15)=" + s2);
    }
}
