public class smallest_character {
    public static void main(String[] args) {
         char[] arr={'c','f','j'};
         char target= 'c';
        System.out.println( "smallest_character= "+ nextGreatestLetter(arr, target));
        //System.out.println( (int)target);
//        System.out.println( (char )106);
    }
     static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length -1;

        while( start<=end){
            int mid= (start+end)/2;
             if( target<letters[mid]) end=mid-1;
            else start=mid+1;
        }
//        if( start== letters.length) start %= (letters.length);
        return ( letters[start % (letters.length)]);   //it wil return same number until start= length of array
//                                                       if start = length of array it'll return 0 i.e first
//                                                       element of array
    }
}
