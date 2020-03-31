package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @author XiangZhang
 * @date 2020/3/30 - 23:13
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};

        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
