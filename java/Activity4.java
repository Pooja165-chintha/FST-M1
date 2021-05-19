package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] numArr = {9,2,7,10,1,19,2};
		sortArray(numArr);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(numArr));
		
	}
	
	public static void sortArray(int array[]) {
int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
	}

}
