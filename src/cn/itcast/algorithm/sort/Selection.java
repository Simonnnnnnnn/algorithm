package cn.itcast.algorithm.sort;

/**
 * @author XiangZhang
 * @date 2020/3/31 - 22:14
 * 选择排序
 */
public class Selection {

    public static void sort(Comparable[] a){
        for (int i = 0; i <= a.length - 2; i++) {
            //定义一个变量，记录最小元素所在索引，默认为参与选择排序的第一个元素所在位置
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                //需要比较最小索引minIndexc处的值和j索引处的值
                if(greater(a[minIndex],a[j])){
                    minIndex = j;
                }
            }
            //交换最小元素所在索引minIndex处的值和索引i处的值
            exch(a,i,minIndex);
        }
    }


    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }



    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
