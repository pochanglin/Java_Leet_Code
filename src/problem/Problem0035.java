package problem;

public class Problem0035 {

	public static void main(String[] args) {
		Problem0035 p = new Problem0035();
		
		int[] nums = {1,3,5,6};
		int target = 0;
		
		System.out.println(p.searchInsert(nums, target));

	}
	
	public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        int mid = 0;
        
        while(start <= end){
        	mid = (start+end)/2;
        	
        	if(target > nums[nums.length-1]) return nums.length;
        	
        	if(target > nums[mid] && target <= nums[mid+1]){
        		return mid+1;
        	}else if(target > nums[mid] && target > nums[mid+1]){
        		start = mid+1;
        	}else if(target < nums[mid] && target < nums[mid+1]){
        		end = mid-1;
        	}
        }
        return 0;
    }

}
