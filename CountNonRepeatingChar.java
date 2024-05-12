public class CountNonRepeatingChar {
    static void printFrequency(String str, int n) {
        int freq[] = new int[256];
        char ch[] = str.toCharArray();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') // ignoring the space in the string
                continue;
            else
                freq[(int) str.charAt(i)]++;//incrementing each character's frequency
        }
        // Printing the frequency of the string
        for (int i = 0; i < n; i++) {
            if (freq[(int) str.charAt(i)] == 1 && ch[i] != ' ') {
                System.out.print(ch[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "alokkolamishra";
        int n = str.length();
        System.out.println("Non-Repeating characters: ");
        printFrequency(str, n);
    }
}
    
