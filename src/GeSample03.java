/*
 * AI生成規則検証用プログラム
 * for Gemini Code Assist
 */
public class GeSample03 {

    private static final String mode = "1";

    public static void main(String[] args) {
        String result = "1".equals(mode) ? "こんにちは" : ("2".equals(mode) ? "こんばんは" : "");
        System.out.println(result);
    }
}