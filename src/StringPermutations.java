import java.util.Arrays;

public class StringPermutations {


    //**Finding the permutations between two strings.
    static boolean isPermutation(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        int[] charCount = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            ++charCount[s1.charAt(i)];
        }
        for (int i = 0; i < s2.length(); i++) {
            if (--charCount[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }


    static void findKey(String input,char key)
    {
        for (int i=0;i<input.length();i++)
        {

            System.out.println(input.charAt(i)==key);
          //  System.out.println(input.charAt(i));
        }
    }
    public static void main(String[] args) {
        //System.out.println(isPermutation("ggggggg", "ggggggg"));
        findKey("gopinath",'g');
    }
}
