public class InsertionSort
{
	public static void main(String[] args) {
	int[] nums={1,3,5,8,0,-1,-99,-999999};
	  for(int i=1;i<nums.length;i++){
	      int j=i-1;
	      int key=nums[i];
	      while(j>=0 && nums[j]>key){
	          nums[j+1]=nums[j];
	          j--;
	      }nums[j+1]=key;
	  }
	  for(int val:nums){
	      System.out.print(val+" ");
	  }
	}
}