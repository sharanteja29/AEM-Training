package Activity3;
public class TestArray {
	public static void printArr(int arr[])
	{
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[20];
		for(int i=0;i<20;i++) {
			arr[i]=i+1;
		}
		int evenArr[]=new int[5];
		int oddArr[]=new int[5];
		int j=0;
		int m =0;
		for(int i:arr) {
			if(j==5 && m==5) {
				break;
			}
			if(i%2==0) {
				evenArr[j] = i;
				j+=1;
			}
			if(i%2!=0) {
				oddArr[m] = i;
				m+=1;
			}

		}
		printArr(arr);
		printArr(evenArr);
		printArr(oddArr);
	}

}
