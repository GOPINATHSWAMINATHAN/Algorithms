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

    public static void main(String[] args) {
        //System.out.println(  hasUniqueChars("malayalam"));
        boolean check[]=new boolean[256];
        String a="Gopinath";
        for (int i=0;i<a.length();i++)
        {
            System.out.println(a.charAt(i));
            if(check[a.charAt(i)])
            {
                System.out.println(false);
            }
            else
            {
                System.out.println(true);
            }
        }
    }
}
