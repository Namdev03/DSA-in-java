package strings;

public class string {
   static int vowel(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}
    public static void main(String[] args) {
        String str = "namdev";
        System.out.println(vowel(str));
        String firstName = "Love";
        System.out.println(firstName.charAt(1));
        String name1 = "namdev";
        String name2 = "namdev";
        if (name1 == name2) {
            System.out.println("both variable are refference to same values");
        }
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        //printing ech charechtor of the string 
        String s = "namdev";
        int n=s.length();
        for (int i = 0; i <n; i++) {
        System.out.println("char of s "+ i +" "+ s.charAt(i));
        }

    }
}
