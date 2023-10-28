public class even {
    public static void main(String[] args) {
        int [] nums  ={12,3459,22,6,7898};
        System.out.println( find_number(nums));

//        System.out.println( fi);
    }

    static int find_number( int [] nums) {
        int even=0;
        for (int num : nums) {
            if (countdgit(num)%2==0) even++;
        }return even;
    }


     static int countdgit(int num) {
        int count =0;
        while( num !=0){
            num=num/10;
            count++;
        }
            return count;
    }

    }
