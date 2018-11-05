package com.gchr;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author gongchunru
 * @create 2018-10-16 8:03 PM
 */
public class Test4 {

    public static void main(String[] args) {
        // 随机数对象，用来模拟事件
        Random random = new Random();
        // 支票的总数
        int checkNums = 4;
        for (int m = 0; m < 10; m++) {
            // 模拟次数
            int times = 100000;
            // 参赛者第一次选择中奖和第二次选择中奖的次数
            int firstSelectPrize = 0;
            int secondSelectPrize = 0;
            while (times-- > 0) {
                // 数组中设置一个元素为true
                boolean[] boxes = new boolean[]{false, false, false, false};
                int rightIndex = random.nextInt(checkNums);
                boxes[rightIndex] = true;

                // 参赛者从里面随机抽出来一个
                int firstSelectIndex = random.nextInt(checkNums);

                // 主持人从剩下的里面选出来一个假的
                int ownerSelectIndex = random.nextInt(checkNums);
                while (ownerSelectIndex == firstSelectIndex || boxes[ownerSelectIndex]) {
                    ownerSelectIndex = random.nextInt(checkNums);
                }

                // 如果改变选择，选择剩余的门
                int secondSelectIndex = random.nextInt(checkNums);
                while (secondSelectIndex == firstSelectIndex || secondSelectIndex == ownerSelectIndex) {
                    secondSelectIndex = random.nextInt(checkNums);
                }

                // 第一次中奖
                if (boxes[firstSelectIndex]) firstSelectPrize++;
                // 第二次中奖
                if (boxes[secondSelectIndex]) secondSelectPrize++;
            }


            BigDecimal d = new BigDecimal((double) firstSelectPrize/100000);
            BigDecimal d2 = new BigDecimal((double) secondSelectPrize /100000);

            System.out.println("本次统计，不更改选择中奖：" + d + "，更改选择中奖：" + d2);
        }

    }

}
