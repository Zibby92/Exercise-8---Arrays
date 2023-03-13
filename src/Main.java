import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static int[][] array1 = {{3, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] array2 = {{2, 2, 3}, {4, 5, 6}, {7, 9}};
    static String[] string1= {"aaa","bb","ccc"};
    static String[] string2 ={"aaa","bbb","ccc"};
    static int[] arrayWithIntOnly = {20,40,55,21,2,6,4,777};

    public static void main(String[] args) {
        System.out.println(biggestArray(array1));
        System.out.println(array1[2]);

    }
            //Return array with biggest int inside in 2d array
    static int[] biggestArray(int[][] array) {
        int[] total = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                total[i] += array[i][j];
            }
        }
        Arrays.sort(total);
        return array[total.length- 1];
    }


            //Return highest numbers in int array
    static int higherInt(int[]array) {
        Arrays.sort(array);
        return array[array.length -1];
    }
            //Return lowest numbers in int array
static int lowerInt(int[]array) {
    Arrays.sort(array);
    return array[0];
    }
            //Return array of strings with more symbols inside
    static String[] whichArrayWithStringHaveMoreSymbols(String[] string1, String[] string2){
        int total1 = 0;
        int total2 = 0;
        for (String s:string1) {
            total1 += s.length();
        };
        for (String s:string2) {
            total2 += s.length();
        };
        if (total1 > total2 ) return string1;
        return string2;
    }



                // Chose array 2d with biggest numbers inside
    static int amountArrayIn(int[][] array1) {
        int amount1 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                amount1 += array1[i][j];
            }
        }
        return amount1;
    }


    static int[][] array2d(int[][] array1, int[][] array2) {
       if(amountArrayIn(array1) > amountArrayIn(array2)) return array1;
       else return array2;

    }
}
