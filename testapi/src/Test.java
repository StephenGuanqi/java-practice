import java.io.File;
import java.util.Hashtable;

/**
 * Created by guanqiyu on 6/6/17.
 */
public class Test {

    public static void main(String[] args) {
        File file;
        String toolChainRoot = System.getenv("XCODE_TOOLCHAIN_ROOT");
        if (toolChainRoot == null){
            System.out.println("XCODE_TOOLCHAIN_ROOT is not defined in the environment variables.");
            file = new File(".");
        }else {
            file = new File(toolChainRoot);
        }
        System.out.println(file);

    }

}
