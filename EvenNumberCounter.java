/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbercounter;

/**
 *
 * @author DouglasD
 */
public class EvenNumberCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayOfInts = {1,4,6,7,34,42};
        System.out.println(countEvens(arrayOfInts));
    }

    public static int countEvens(int[] nums) {
        int arrayLength = nums.length;
        int evenNumberCounter = 0;

        for (int i = 0; i < arrayLength; i++) {
            if ((nums[i] % 2) == 0) {
                evenNumberCounter++;
            }
        }
        return evenNumberCounter;
    }

}
