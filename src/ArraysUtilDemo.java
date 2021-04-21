import java.util.Arrays;

public class ArraysUtilDemo {
    public static void main(String[] args) {

        //主要学习Arrays类的相关方法
        int[] a = {1,3,2,66,23,909,4343,33};

        System.out.println(a); //[I@1b6d3586 是一个哈希code

        //打印数组
        System.out.println(Arrays.toString(a));

        //排序-升序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
