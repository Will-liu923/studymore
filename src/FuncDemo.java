public class FuncDemo {
    public static void main(String[] args) {

        int maxNum = max(3,2);
        System.out.println(maxNum);

        FuncDemo funcDemo = new FuncDemo();
        int min = funcDemo.min(3,2);
        System.out.println(min);

        System.out.println(sum(3,2));


        System.out.println(printMax(1,2,5,4,6,7,9,5));
        System.out.println(printMax(1));
    }

    public static int max(int a, int b) { //static 修饰的方法为类方法，可以直接调用，不需要创建类的实例对象
        if (a >= b) {
            return a;
        }
        return b;
    }

    public int min(int a, int b) {  //没有被static修饰的方法需要创建类的实例才能被调用
        return a <= b ? a : b;
    }

    public static int sum(int a, int b) {  //这是一中思维，初始化一个变量，在后续的条件中进行赋值
        int result;
        if (a >= b) {
            result = a * 2;
        }else {
            result = b * 2;
        }
        return result;
    }

    public static int printMax(int... num) {//可变参数：必须是形参的最后一个。所有参数必须是同一个类型

        if (num.length == 0) {
            return 0;
        }

        int maxNumber = num[0];
        for (int i = 1; i < num.length ; i++) {//注意数组下表越界,这是一个人简单的排序
            if (num[i] > maxNumber) {
                maxNumber = num[i];
            }
        }
        return maxNumber;
    }
}
