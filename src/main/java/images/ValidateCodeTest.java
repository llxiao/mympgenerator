package images;

import com.shawn.util.IDGenerate;
import com.xiaoleilu.hutool.util.StrUtil;


import java.io.IOException;

/**
 * Created by Shawn on 2017/8/31.
 */
public class ValidateCodeTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ValidateCode vCode = new ValidateCode(100, 40, 6, 100);
        try {
//            String filesLocation = System.getProperty("evan.webapp") + "gouliaoweb-1.0/upload/images/";
            String filesLocation =  "D://images/";
            String fileName = StrUtil.format("code_{}.png", IDGenerate.getNextID());
            String path = StrUtil.format("{}{}",filesLocation,fileName);
            System.out.println(vCode.getCode() + " >" + path);
            vCode.write(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
