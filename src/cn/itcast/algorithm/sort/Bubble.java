package cn.itcast.algorithm.sort;

import com.sun.jmx.snmp.SnmpPduBulk;

/**
 * @author XiangZhang
 * @date 2020/3/30 - 23:06
 * 冒泡排序
 */
public class Bubble {

    public static void sort(Comparable[] a){
        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //比较索引j和索引j+1处的值
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
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
