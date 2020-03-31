package cn.itcast.algorithm.sort;

import java.security.spec.ECField;

/**
 * @author XiangZhang
 * @date 2020/3/31 - 22:45
 * 插入排序
 */
public class Insertion {


    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                //比较索引j处的值和索引j-1处的值，如果索引j-1处的值比索引j处的值大，就交换位置；
                //反之，则说明找到了适合的位置，需要跳出循环
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else {
                    break;
                }
            }
        }
    }



    /**
     * 比较两数大小
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }


    /**
     * 交换两数位置
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
