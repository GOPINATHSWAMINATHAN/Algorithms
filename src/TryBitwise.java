public class TryBitwise {


    static boolean hasUniqueChars(String str) {
        if (str == null || str.isEmpty()) return false;
        if (str.length() > 256) return false;
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charSet[ch])
                return false;
            else
                charSet[ch] = true;
        }
        return true;
    }


    //Fill %20 at spaces between words and trim the string

    static void replaceSpaces(char[] str, int length) {
        // 1st scan: count spaces
        int cnt = 0;
        for (char ch : str) {
            if (ch == ' ') ++cnt;
        }

        // 2nd scan: replace spaces
        int p = length + 2 * cnt;
        System.out.println("p value is "+p);
        str[p] = '\0'; //XXX
        --p;
        for (int i = length - 1; i >= 0; --i) {
            if (str[i] == ' ') {
                str[p--] = '0';
                str[p--] = '2';
                str[p--] = '%';
            } else {
                str[p--] = str[i];
            }
        }
    }
    public static void main(String[] args) {
        //System.out.println(  hasUniqueChars("malayalam"));
//        boolean check[]=new boolean[256];
//        String a="Gopinath";
//        for (int i=0;i<a.length();i++)
//        {
//            System.out.println(a.charAt(i));
//            if(check[a.charAt(i)])
//            {
//                System.out.println(false);
//            }
//            else
//            {
//                System.out.println(true);
//            }
//        }
        char[] str = {'a','b',' ','c',' ','d','\0','\0','\0','\0','\0','\0','\0'};
        replaceSpaces(str, 6);
        for(char s:str)
        {
            System.out.println(s);
        }
    }
}
