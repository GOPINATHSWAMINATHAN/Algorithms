/**
 * Checks if one word is a substring of another.
 */

public class StringRotation {

    //TYPE ONE

    public static boolean secondIsSubString(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean secondIsRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return secondIsSubString(s1s1, s2);
        }
        return false;
    }

    //TYPE TWO
    static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length()) return false;
        //  System.out.println(s1 + s1);
        return isSubString(s1 + s1, s2);
    }

    static private boolean isSubString(String s1, String s2) {
        return s1.contains(s2);

        /**
         * waterbottle+waterbottle.contains(erbottlewat)
         */
    }


    public static void main(String[] args) {

        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = secondIsRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
