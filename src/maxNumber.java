public class maxNumber {
    public static void main(String[] args) {




      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */
         /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */
        int[][] input={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                if(input[i][j]>enBuyukSayi){enBuyukSayi=input[i][j];}



            }

        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
    }
}






