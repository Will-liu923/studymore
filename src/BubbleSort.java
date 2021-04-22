/*
冒泡排序：
1、比较数组中两个相邻元素，如果第一个数比第二个数大，就交换他们的位置
2、每一次比较都会产生一个最大或者最小的数字
3、下一轮可以少一次排序
4、一次循环，直到结束
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {5,2,2,1,13,4,66,12};
        int[] b = bubbleSort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        //首先确定循环次数
        for (int i = 0; i < array.length; i++) {
            //第二：相邻元素比较，如果第一个数比第二个数大，就交换位置
            for (int j = 0; j < array.length - 1 - i; j++) { //这里-i是指，每一轮都能比较出一个最大或最小的数，那么内层比较就能少比一个数
                if (array[j + 1] < array[j]) { //这是从小到大排序，反之只要 > 即可。
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort2(int[] array) { //优化排序，如果进来的数组/排过一轮的数组已经是顺序的了，就不需要再排序了

        int temp;
        //首先确定循环次数
        for (int i = 0; i < array.length; i++) {

            //定义一个标志位
            boolean flag = false;
            //第二：相邻元素比较，如果第一个数比第二个数大，就交换位置
            for (int j = 0; j < array.length - 1 - i; j++) { //这里-i是指，每一轮都能比较出一个最大或最小的数，那么内层比较就能少比一个数
                if (array[j + 1] < array[j]) { //这是从小到大排序，反之只要 > 即可。
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true; //如果不满足if条件就不会执行这里
                }
            }
            if (!flag) { //flag为false则表示上面的if条件不满足，就不需要进行排序，退出循环即可。
                break;
            }
        }
        return array;
    }
}
