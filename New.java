package Azad;

import java.util.ArrayList;

public class New {
    public static void main(String[] args) {
        int a =3;
//        pattern(5);
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        largest(7,2,19);
        //int[] array = {-3,-3,-3,-3,-3,-2,0,0,1,1,1,1};
        //duplicate(array);
        var();
        System.out.println(a);
    }
    public static void pattern (int n) {
        for (int row = 1; row <= n; row++) {
            for ( int col = 1; col<= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1 (int n) {
        for (int row = n; row >= 1; row--) {
            for ( int col = n; col>= n-row+1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern2 (int n) {
        for (int row = 0; row < n; row++) {
            int space = row;
            for (int i = 0; i <=space; i++ ) {
                System.out.print(" ");
            }
            for ( int col = 1; col<= n-row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern3 (int num) {
        for (int row = 1; row<= num; row++) {
            for (int col = 1; col<= num; col++) {
                if (row==1 || row==num || col==1 || col==num) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern4 (int n) {
        for (int row = 0; row< n; row++) {
            int space = n-row;
            for ( int i = 0; i<= space; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col<=n; col++) {
                System.out.print("* ");
                }
            System.out.println();
            }
        }
    public static void pattern5 (int n) {
        for (int row = 0; row< n; row++) {
            int space = row;
            for ( int i = 0; i<= space; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col<=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6 (int n) {
        for (int row = 0; row< n; row++) {

            for (int col = 1; col<=n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void largest ( int a, int b, int c) {
        if ( a > b && a > c ) {
            System.out.println( a + " is largest" );
        } else if ( b > c && b > a ) {
            System.out.println( b + " is largest" );
        } else System.out.println( c + " is largest" );
    }
//    public static void duplicate(int[] array){
//        ArrayList list = new ArrayList();
//        if (array.length==1) {
//            list.add(array[0]);
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] != array[i-1]){
//                list.add(array[i-1]);
//            }
//            if (i+1==array.length){
//                list.add(array[i]);
//            }
//
//        }
//        System.out.println(list);
//    }

    public static void duplicate(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length > 0) {
            list.add(array[0]); // Add the first element to the list
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    list.add(array[i]); // Add the element if it's different from the previous one
                }
            }
        }
        System.out.println(list);
    }
    public static void var(){
        int a = 5;

    }
    }

