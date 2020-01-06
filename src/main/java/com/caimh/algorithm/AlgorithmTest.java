package com.caimh.algorithm;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by caimh on 2019/12/30.
 */
public class AlgorithmTest {

    /**
     * 二分查找
     * 二分法查找适用于数据量较大时，但是数据需要先排好顺序。主要思想是：（设查找的数组区间为array[low, high]）
     */
    @Test
    public void binarySearch() {
        //目标数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //目标元素
//        System.out.println("请输入要查找的元素：");
//        Scanner scanner = new Scanner(System.in);
//        int target = scanner.nextInt();
        int target = 9;
        //开始位置
        int begin = 0;
        //结束位置
        int end = arr.length - 1;
        //中间位置
        int mid = (begin + end) / 2;
        //目标元素位置
        int index = -1;
        //查找次数
        int count = 0;

        //循环查找
        while (begin <= mid && mid > 0) {
            count++;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
                mid = (begin + end) / 2;
            } else {
                begin = mid + 1;
                mid = (begin + end) / 2;
            }
        }

        System.out.println("目标元素下标：" + index);
        System.out.println("查找次数：" + count);
    }

    /**
     * 归并排序
     */
    @Test
    public void mergeSort() {

    }
}
