package Arrays;

public class Arrange_numbers_in_array {
	
	public static void arrange(int arr[], int n) {
		int left=0;
		int right=n-1;
		int counter=0;
		
		while(left<=right) {
			
			if(counter%2==1) {
				arr[left]=counter;
				counter+=1;
				left+=1;
				
			}else
			{
				arr[right]=counter;
				counter+=1;
				right -=1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         	}

}
