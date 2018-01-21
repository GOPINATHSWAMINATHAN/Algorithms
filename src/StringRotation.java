/**
 * Checks if one word is a substring of another.
 */

public class StringRotation {

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
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
