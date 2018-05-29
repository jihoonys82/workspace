package co.ji.test;

public class Test1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q2-4
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		int rank_arr[] = new int[arr.length];
//		int max=0;
//		int maxIndex=0;
//		int rank = 0;
//		int priv_max = 0;
//		for(int j=0;j<rank_arr.length;j++) {
//			for(int i=0;i<arr.length;i++) {
//				if(rank_arr[i] != 0) continue;
//				if(arr[i]>max) {
//					max = arr[i];
//					maxIndex = i;
//				}
//			}
//			
//			if(priv_max==max) {
//				rank_arr[maxIndex] = rank;
//				rank++;
//			} else {
//				rank++;
//				rank_arr[maxIndex] = rank;				
//			}
//			priv_max = max;
//			
//			max=0;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();
//		for(int j=0;j<rank_arr.length;j++) {
//			System.out.print(rank_arr[j] + "\t");
//		}
//		System.out.println();
		
		
		//Q. 2-5
		int[] over_arr = new int[10];
		int[] ret_arr = new int[10];
		int temp = 0;
		int over_arr_nextIndex = 0;
		int remain_length = over_arr.length;
		for(int i=0;i<arr.length;i++) {
			ret_arr[i] = arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<10-i-1;j++) {
				if(ret_arr[j+1]==0) continue;;
				if(ret_arr[j]>ret_arr[j+1]) {
					temp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = temp;
				} else if(ret_arr[j] == ret_arr[j+1]) {
					over_arr[over_arr_nextIndex] = ret_arr[j];
					remain_length = 10 - (over_arr_nextIndex * 2) -2; 
					for(int k=j;k<remain_length;k++) {
						ret_arr[k] = ret_arr[k+2];
					}
					for(int l=remain_length;l<over_arr.length;l++) {
						ret_arr[l] = 0;
					}
					over_arr_nextIndex++;
				}
				
			}
		}
		
		for(int i=0;i<over_arr.length;i++) {
			System.out.print(over_arr[i] + "\t");
		}
		System.out.println();
		for(int i=0;i<ret_arr.length;i++) {
			System.out.print(ret_arr[i] + "\t");
		}
		System.out.println();
		
		
	}

}

//
//int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//배열이 선언된 뒤 문제를 푸시오
//
//- 위의 숫자를 invert_arr라는
//배열에 거꾸로 입력하시오
//	=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//- 위의 숫자의
//(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//구하시오
//
//- 위의 숫자를 높은 숫자가 1등이 되게하여
//rank_arr라는 배열에 순위를 입력하시오
//	=> arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//=> rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//- 중복된 값은 over_arr에 넣고 중복되지
//않은 값은 ret_arr에 입력하시오
//
//	정렬까지 했다면
//	=> over_arr : { 9, 10 }
//	=> ret_arr : { 3, 8, 13, 17, 21, 27 }