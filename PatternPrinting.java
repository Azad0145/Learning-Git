package Azad;

import java.util.ArrayList;

public class PatternPrinting {
    public static void main(String[] args) {
        pattern( 5 );
        pattern1( 5 );
        pattern2( 5 );
        pattern3( 5 );
        pattern4( 5 );
        pattern5( 5 );
        pattern6( 5 );

    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }

    public static void pattern1(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= n - row + 1; col--) {
                System.out.print( col );
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            int space = row;
            for (int i = 0; i <= space; i++) {
                System.out.print( " " );
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print( "* " );
            }

            System.out.println();
        }
    }

    public static void pattern3(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if ( row == 1 || row == num || col == 1 || col == num ) {
                    System.out.print( " * " );
                } else {
                    System.out.print( "   " );
                }

            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            int space = n - row;
            for (int i = 0; i <= space; i++) {
                System.out.print( "  " );
            }
            for (int col = 1; col <= n; col++) {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 0; row < n; row++) {
            int space = row;
            for (int i = 0; i <= space; i++) {
                System.out.print( "  " );
            }
            for (int col = 1; col <= n; col++) {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print( "* " );
            }
            System.out.println();
        }
    }
}



