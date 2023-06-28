package solutions;

public class Patterns {
       public static void main(String[] args) {
              pattern35(4);
       }

       // 1.  *****
       //     *****
       //     *****
       //     *****
       //     *****

       static void pattern1(int n){
              String str = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<n; c++){
                            System.out.print(str);
                     }
                     System.out.println();
              }
       }

       // 2.  *
       //     **
       //     ***
       //     ****
       //     *****

       static void pattern2(int n){
              String str = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<=r; c++){
                            System.out.print(str);
                     }
                     System.out.println();
              }
       }

       // 3.  *****
       //     ****
       //     ***
       //     **
       //     *

       static void pattern3(int n){
              String str = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<n-r; c++){
                            System.out.print(str);
                     }
                     System.out.println();
              }
       }

       // 4.  1
       //     1 2
       //     1 2 3
       //     1 2 3 4
       //     1 2 3 4 5
       static void pattern4(int n){
              for(int r = 1; r<=n; r++){
                     for(int c = 1; c<=r; c++){
                            System.out.print(c + " ");
                     }
                     System.out.println();
              }
       }

       // 5.  *
       //     **
       //     ***
       //     ****
       //     *****
       //     ****
       //     ***
       //     **
       //     *
       static void pattern5(int n){
              String str = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<=r; c++){
                            System.out.print(str);
                     }
                     System.out.println();
              }
              for(int r = 1; r<n; r++){
                     for(int c = 0; c<n-r; c++){
                            System.out.print(str);
                     }
                     System.out.println();
              }
       }

       // 6.       *
       //         **
       //        ***
       //       ****
       //      *****
       static void pattern6(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<=n-r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c<=r; c++){
                            System.out.print(star);
                     }
                     System.out.println();
              }
       }

       // 7.   *****
       //       ****
       //        ***
       //         **
       //          *
       static void pattern7(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c<n-r; c++){
                            System.out.print(star);
                     }
                     System.out.println();
              }
       }

       // 8.      *
       //        ***
       //       *****
       //      *******
       //     *********
       static void pattern8(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c < n - r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c<2*r+1; c++){
                            System.out.print(star);
                     }
                     System.out.println();
              }
       }

       // 9.  *********
       //      *******
       //       *****
       //        ***
       //         *
       static void pattern9(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c<r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c < 2*(n - r) - 1; c++){
                            System.out.print(star);
                     }
                     System.out.println();
              }
       }

       // 10.      *
       //         * *
       //        * * *
       //       * * * *
       //      * * * * *
       static void pattern10(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c <= n - r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c <= r; c++){
                            System.out.print(star+space);
                     }

                     System.out.println();
              }
       }

       // 11.  * * * * *
       //       * * * *
       //        * * *
       //         * *
       //          *
       static void pattern11(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c < r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c < n - r; c++){
                            System.out.print(star+space);
                     }
                     System.out.println();
              }
       }

       // 12.  * * * * *
       //       * * * *
       //        * * *
       //         * *
       //          *
       //          *
       //         * *
       //        * * *
       //       * * * *
       //      * * * * *
       static void pattern12(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){
                     for(int c = 0; c <= r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c < n - r; c++){
                            System.out.print(star+space);
                     }
                     System.out.println();
              }
              for(int r = 0; r<n; r++){
                     for(int c = 0; c < n-r; c++){
                            System.out.print(space);
                     }
                     for(int c = 0; c <= r; c++){
                            System.out.print(star+space);
                     }
                     System.out.println();
              }
       }

       // 13.      *
       //         * *
       //        *   *
       //       *     *
       //      *********
       static void pattern13(int n){
              String space = " ";
              String star = "*";
              for(int r = 0; r<n; r++){ 
                     if(r==n-1){
                            System.out.print(space);
                     }
                     for(int c = 0; c < 2*n-1; c++){
                            if(r==n-1){
                                   System.out.print(star);
                            }
                            else if(c == (n-r) || c == (n+r)){
                                   System.out.print(star);
                            } else {
                                   System.out.print(space);
                            }
                     }
                     System.out.println();
              }
       }

       // 14.  *********
       //       *     *
       //        *   *
       //         * *
       //          *
       static void pattern14(int n){

       }

       // 15.      *
       //         * *
       //        *   *
       //       *     *
       //      *       *
       //       *     *
       //        *   *
       //         * *
       //          *
       static void pattern15(int n){

       }

       // 16.           1
       //             1   1
       //           1   2   1
       //         1   3   3   1
       //       1   4   6   4   1
       static void pattern16(int n){

       }

       // 17.      1
       //         212
       //        32123
       //       4321234
       //        32123
       //         212
       //          1
       static void pattern17(int n){

       }

       // 18.   **********
       //       ****  ****
       //       ***    ***
       //       **      **
       //       *        *
       //       *        *
       //       **      **
       //       ***    ***
       //       ****  ****
       //       **********
       static void pattern18(int n){

       }

       // 19.    *        *
       //        **      **
       //        ***    ***
       //        ****  ****
       //        **********
       //        ****  ****
       //        ***    ***
       //        **      **
       //        *        *
       static void pattern19(int n){

       }

       // 20.    ****
       //        *  *
       //        *  *
       //        *  *
       //        ****
       static void pattern20(int n){

       }

       // 21.    1
       //        2  3
       //        4  5  6
       //        7  8  9  10
       //        11 12 13 14 15
       static void pattern21(int n){

       }

       // 22.    1
       //        0 1
       //        1 0 1
       //        0 1 0 1
       //        1 0 1 0 1
       static void pattern22(int n){

       }

       // 23.        *      *
       //          *   *  *   *
       //        *      *      *
       static void pattern23(int n){

       }

       // 24.    *        *
       //        **      **
       //        * *    * *
       //        *  *  *  *
       //        *   **   *
       //        *   **   *
       //        *  *  *  *
       //        * *    * *
       //        **      **
       //        *        *
       static void pattern24(int n){

       }

       // 25.       *****
       //          *   *
       //         *   *
       //        *   *
       //       *****
       static void pattern25(int n){

       }

       // 26.   1 1 1 1 1 1
       //       2 2 2 2 2
       //       3 3 3 3
       //       4 4 4
       //       5 5
       //       6
       static void pattern26(int n){

       }

       // 27.   1 2 3 4  17 18 19 20
       //         5 6 7  14 15 16
       //           8 9  12 13
       //             10 11
       static void pattern27(int n){

       }

       // 28.      *
       //         * *
       //        * * *
       //       * * * *
       //      * * * * *
       //       * * * *
       //        * * *
       //         * *
       //          *
       static void pattern28(int n){

       }

       // 29.      
       //        *        *
       //        **      **
       //        ***    ***
       //        ****  ****
       //        **********
       //        ****  ****
       //        ***    ***
       //        **      **
       //        *        *
       static void pattern29(int n){

       }

       // 30.         1
       //           2 1 2
       //         3 2 1 2 3
       //       4 3 2 1 2 3 4
       //     5 4 3 2 1 2 3 4 5
       static void pattern30(int n){

       }


       // 31.      4 4 4 4 4 4 4  
       //          4 3 3 3 3 3 4   
       //          4 3 2 2 2 3 4   
       //          4 3 2 1 2 3 4   
       //          4 3 2 2 2 3 4   
       //          4 3 3 3 3 3 4   
       //          4 4 4 4 4 4 4   
       static void pattern31(int n){

       }

       // 32.    E
       //        D E
       //        C D E
       //        B C D E
       //        A B C D E
       static void pattern32(int n){

       }

       // 33.    a
       //        B c
       //        D e F
       //        g H i J
       //        k L m N o
       static void pattern33(int n){

       }
       
       // 34.    E D C B A
       //        D C B A
       //        C B A
       //        B A
       //        A
       static void pattern34(int n){

       }
       
       // 35.    1      1
       //        12    21
       //        123  321
       //        12344321
       static void pattern35(int n){
              for(int r=1; r<=n; r++){
                     System.out.print(getRow(r,n));
                     System.out.println();
              }

       }

       private static String getRow(int rowNum, int totRows){
              String res = "   ";
              for(int c = 1; c<2*totRows;c++){
                     if(c <= rowNum){
                            res += c;
                     } else if (c >= (2*totRows - rowNum)) {
                            res += 2*totRows - c;
                     } else {
                            res += " ";
                     }
              }
              return res;
       }

}