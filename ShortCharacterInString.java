import java.util.*;
public class ShortCharacterInString {
    public static String Sort(String str){
        char[] char_arr=str.toCharArray();
        Arrays.sort(char_arr);
        String ans=new String(char_arr);
        return ans;
    }
    public static void main(String[] args){
        String str="bcafed";
        System.out.println(Sort(str));
    }
    
}

























