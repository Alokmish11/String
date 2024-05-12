public class CountVowelConsonantAndSpace {
    static void Count(String str,int length){
        int vowel=0,consonant=0,space=0;
       // str = str.toLowerCase(); 
        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
          if(ch=='a' ||  ch=='e' || ch=='i'|| ch=='o'||ch=='u')
            vowel++;
          else if (ch >= 'a' &&  ch <= 'z')
            consonant++;
          else if(ch == ' ')
            space++;
        }
          System.out.println("vowels : "+vowel);
          System.out.println("consonant : "+consonant);
          System.out.println("space : "+space);

        
    }
    public static void main(String[] args){
        String str="Hii Hello Bye";
        int length=str.length();
        Count(str,length);
    }
    
}
