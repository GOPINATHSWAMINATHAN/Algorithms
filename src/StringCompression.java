public class StringCompression {

    static String compress(String s) {
        if (s == null || s.isEmpty()) return s;

        char prev = s.charAt(0);
        int cnt = 1;
        StringBuffer sb = new StringBuffer();
        sb.append(prev);
        for (int i = 1; i < s.length(); ++i) {
            char curr = s.charAt(i);
            if (curr == prev) {
                ++cnt;

            } else {
                prev = curr;
                sb.append(cnt)
                        .append(curr);
                cnt = 1;
            }
        }
        sb.append(cnt);

        return sb.toString().length() >= s.length() ? s : sb.toString();
    }

    public static void main(String args[])
    {
        String a="gopnath";
        StringBuffer sb=new StringBuffer();
        sb.append(a);
        sb.append("pulipahdy");
        System.out.println(sb);

        System.out.println(compress("aaabccccccaaa"));
    }


}
