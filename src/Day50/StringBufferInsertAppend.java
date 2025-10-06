package Day50;

public class StringBufferInsertAppend {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Learning");
        sb.append(" Java").insert(sb.length(), " with fun");
        System.out.println(sb);
    }
}
