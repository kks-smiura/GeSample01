/**
 * コマンドライン引数に応じて、コンソールに異なる挨拶を出力するクラスです。
 */
public class HelloWorld {

    /**
     * Javaアプリケーションのエントリーポイント（開始点）となるmainメソッドです。
     * コマンドライン引数の最初の値に応じて、異なる挨拶を出力します。
     * - "1" の場合: "こんにちは"
     * - "2" の場合: "こんばんは"
     *
     * @param args コマンドライン引数。args[0]に "1" または "2" を期待します。
     */
    public static void main(String[] args) {
        // コマンドライン引数が渡されているかチェックします
        if (args.length == 0) {
            System.out.println("引数を指定してください。'1' または '2' を入力してください。");
            return; // 引数がない場合はプログラムを終了します
        }

        // 最初の引数に基づいて処理を分岐します
        switch (args[0]) {
            case "1" -> System.out.println("こんにちは");
            case "2" -> System.out.println("こんばんは");
            default -> System.out.println("引数が無効です。'1' または '2' を入力してください。");
        }
    }
}
