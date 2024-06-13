import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHTML {
    public static void main(String[] args) {
        // HTMLコンテンツを文字列として定義
        String htmlContent = "<!DOCTYPE html>\n" +
                             "<html>\n" +
                             "  <head>\n" +
                             "    <meta charset=\"utf-8\">\n" +
                             "    <title>Progate</title>\n" +
                             "  </head>\n" +
                             "  <body>\n" +
                             "    <h1 class=\"title\">Java Paizaラーニング</h1>\n" +
                             "    <a href=\"https://github.com/Kenta-kenpy/paiza-Java\">Java　標準入力備忘録</a>\n" +
                             "  </body>\n" +
                             "</html>";

        // ファイル名を指定
        String fileName = "example.html";

        // ファイルにHTMLコンテンツを書き出す
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(htmlContent);
            System.out.println("HTMLファイルが生成されました: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
