package pack1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("hI");
		
		int[] a = {1,2,3,4,5,6};
		
		System.out.println(product(a, 1, 6));
		
		System.out.println(noOfDivisorsOfAnInteger(720));*/
		String[] m = {"1 2", "1 6"};
		solution(6, m);
		
		
	}
	
	public static void solution(int noOfArrayElements, String[] strArr) {
		int[] intArray = new int[noOfArrayElements];
		for(int i = 1; i <= noOfArrayElements ; i++) {
			intArray[i-1] = i;
		}
		
		//int l = 0,r = 0;
		for(String s : strArr) {
			String[] myStrArr = s.split(" ");
			int l = Integer.parseInt(myStrArr[0]);
			int r = Integer.parseInt(myStrArr[1]);
			System.out.println(noOfDivisorsOfAnInteger(product(intArray, l, r)));
		}
		
		
	}
	
	
	
	
	public static int noOfDivisorsOfAnInteger(int number) {
		int result = 2;
		
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				result++;
			}
		}
		
		
		
		return result;
	}
	
	public static int product(int[] arr, int start, int end) {
		
		int pro = 1;
		
		for(int i = start; i <= end; i++) {
			pro = pro * arr[i - 1];
		}
		
		
		return pro;
	}

}

