public class MajorityElement {

    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};
        System.out.println("Majority element is "+ majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int val =0, freq=0;
        for(int n: nums){
            if(freq==0){
                val=n;
            }
            if(n==val) freq++;
            else freq--;
        }
        return val;
    }

    //soltn via Hashmap
}
