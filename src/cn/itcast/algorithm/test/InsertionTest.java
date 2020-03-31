package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Insertion;

import java.util.Arrays;

/**
 * @author XiangZhang
 * @date 2020/3/31 - 22:50
 */
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
