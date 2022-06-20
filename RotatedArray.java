public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {20 , 30 , 40 , 50 , 60 , 5 , 10};
        int target = 10 ;
        System.out.println(search(arr, target));
    }

    static int search (int[]arr , int target){
        int low = 0 ;
        int high = arr.length -1;

        while (low <= high){
            int mid = (low + high) / 2 ;

            if (target == arr[mid]) return  mid ;

            // for left side

            if (arr[low] < arr[mid]){

                if (target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1 ;
                }
            }

            // for right side
            else {
                if (target <= arr[high] && target > arr[mid]){
                   low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return  -1 ;
    }
}
