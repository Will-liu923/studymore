public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {

        //二维数组
        //int[][] array = new int[3][2];  //二维数组中有3个一维数组，每个一维数组中有两个元素。 默认值为0
        int[][] array = new int[][]{{1, 2}, {2, 3}, {3, 4} ,{5, 6}};


        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
    }
}
