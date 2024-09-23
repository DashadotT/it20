package L02_MultidimensionalArray;

public class MultidimensionalArray {

    public static void main(String[] args) {

        //Declaring multidimensional array
        int[][] evenNumb = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18}
        };

        //Displaying the Multidimensional Array
        for (int i = 0; i < evenNumb.length; i++) {
            for (int j = 0; j < evenNumb[i].length; j++) {
                System.out.print(evenNumb[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
