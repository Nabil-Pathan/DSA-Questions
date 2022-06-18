public class RemoveElement {
    public static void main(String[] args) {
        int[]arr ={ 1, 3 ,2, 2, 4, 5, 2};
        int val = 2 ;
        System.out.println(removeElement(arr,val));

    }

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 0) return 0 ;

        int valid_size = 0 ;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }

        return  valid_size;

    }
}
