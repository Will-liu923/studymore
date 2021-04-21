/*数组：
* 1、长度是确定的，数组一旦被创建，它的大小就是不可以改变的
* 2、元素类型必须相同，不允许出现混合类型
* 3、元素可以是任何类型，包括基本类型和引用类型
* 4、数组变量属于引用类型，数组也可以看成是对象，数组中的没个元素相当于该对象的成员变量
* 5、数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，数组对象本身是在堆中方的。
* */

public class ArrayDemo {
    public static void main(String[] args) {

        //数组定义
        //动态初始化(包含默认初始化：没有被赋值的默认值是0)
        int[] intarr = new int[5]; //5代表数组的长度
        int intarr2[] = new int[5]; //不同的写法，[]位置不同
        int[] intarr3;

        //静态初始化  创建 + 赋值
        int[] intarr4 = {1,2,3,4};

        int a = 1;
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = a;
            a++;
        }
        System.out.println(a);

        for (int i = 0; i < intarr.length; i++) { //遍历数组
            System.out.println(intarr[i]);
        }

        //计算数组所有元素的和
        int sum = 0;
        for (int i = 0; i < intarr.length; i++) {
            sum += intarr[i];
        }
        System.out.println("sum = " + sum);

        //查找数组中最大值
        int maxNum = intarr[0];
        for (int i = 1; i < intarr.length; i++) {
            if (intarr[i] > maxNum) {
                maxNum = intarr[i];
            }
        }
        System.out.println("maxNum = " + maxNum);

        //增强for循环 foreach
        for (int i : intarr) {
            System.out.println(intarr);
        }

        int[] reverse = reverse(intarr);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }

    //反转数组
    public static int[] reverse(int[] array) {
        //定义一个反转之后的数组
        int[] reverse = new int[array.length];
        //
        for (int i = 0; i < array.length; i++) {
            reverse[array.length - i - 1] = array[i];
        }
        return reverse;
    }
}
