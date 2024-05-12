public class ReverseString {

    // Method 1
       // public static void main(String[] args) {
         // String str = "alok";
        //  String reversedStr = "";
          //for (int i = 0; i <str.length(); i++) {
          //  reversedStr = str.charAt(i) + reversedStr;
         // }
         // System.out.println("Reversed string: "+ reversedStr);
        //}


        // Method 2----->>>>
        public static String reverse(String str){
            String reverse ="";
            for(int i=str.length()-1; i>=0;i--){
                reverse+=str.charAt(i);
            }
            return reverse;
        }
        public static void main(String[] args){
            String str ="Mishra";
           // reverse(str);
        
        System.out.println(reverse(str));
      }
    }
