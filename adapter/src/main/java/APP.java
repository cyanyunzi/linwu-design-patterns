import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * @author ：林雾
 * @date ：2020/06/10
 * @description :
 */
public class APP {
    public static void main(String[] args) throws Exception {
//        CommonPig commonPig = new CommonPig();
//        commonPig.eat();
//        commonPig.sleep();
//
//        FlyPig flyPig = new FlyPig();
//        flyPig.eat();
//        flyPig.sleep();

        InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\zhang.lei\\Desktop\\流测试.txt"),"GBK");
        System.out.println(reader.getEncoding());

        char[] chars = new char[500];
        reader.read(chars);
        for (char c : chars) {
            System.out.println(c);
        }
    }

}
