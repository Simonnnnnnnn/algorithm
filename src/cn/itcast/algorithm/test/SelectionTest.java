package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author XiangZhang
 * @date 2020/3/31 - 22:20
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
