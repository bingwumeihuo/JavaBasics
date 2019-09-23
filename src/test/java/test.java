import java.util.Arrays;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: test
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/9/23 14:45
 */
public class test {
    public static void main(String[] args) {
        int [] arr =new int[]{12,11,32,2,22,3,123,42};
        int de=21;
        boolean Flag=true;
        for (int i=0;i<arr.length;i++) {
            if (de==arr[i]){
                System.out.println(i);
                Flag =false;
                break;
            }
        }
        if (Flag ){
            System.out.println("未找到");
        }
    }
}
