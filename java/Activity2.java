package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int sum=30;
		int srchNum=10;
		int numArr[]= {10, 77, 10, 54, -11, 10};
		System.out.println("Original Array"+Arrays.toString(numArr));
		System.out.println("Result:"+ resultFun(numArr,sum,srchNum));
	}

public static boolean resultFun(int[] numArr, int sum, int srchNum) {
	int tempsum=0;
	for (int number: numArr) {
		if (number==srchNum) {
			tempsum += srchNum;
		}
		
		if (tempsum>sum)
			break;
	}
	return tempsum==sum;			
}
}
