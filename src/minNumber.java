import java.util.Arrays;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */


    public static void main(String[] args) {

        int arr[][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);

            if(arr[i][0] < min) min = arr[i][0];
        }
        System.out.println("Minimum = " + min);
    }






}
