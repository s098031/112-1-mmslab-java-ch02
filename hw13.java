import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw13 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問想要選擇哪條路線?");
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int res = Integer.parseInt(str1);
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "次的處裡");
            if (i == res)
                break;
        }
    }
}