public class PalindromeOrNot {
    static boolean palindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args){
        String str="nitin";
        System.out.println(palindrome(str));
    }
    
}
