package com.gchr;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gongchunru
 * @create 2018-10-16 11:34 AM
 */
public class ThreeDoorTest {

    private static final Integer DOOR_NUMS = 3;
    private static Random random = new Random();
    private static List<Boolean> threeDoorList = new ArrayList<>();

    /**
     * 初始化三个门
     */
    static {
        while (threeDoorList.size() < DOOR_NUMS) {
            Integer index = random.nextInt(DOOR_NUMS);
            if (!threeDoorList.contains(index)) {
                if (threeDoorList.size() == 0) {
                    threeDoorList.add(true);
                } else {
                    threeDoorList.add(false);
                }
            }
        }
    }

    /**
     * 参赛者随机选择一扇门
     *
     * @return
     */
    private static int drawOneCheck() {
        return random.nextInt(DOOR_NUMS);
    }

    /**
     * 主持人从剩下的2扇们里面打开一扇没有汽车的门
     *
     * @param hasDrawCheckIndex
     * @return
     */
    private static int ownerDrawOneCheck(int hasDrawCheckIndex) {
        // 主持人从剩下的三张里面抽出来一张假的
        int index = random.nextInt(DOOR_NUMS);
        while (index == hasDrawCheckIndex || threeDoorList.get(index)) {
            index = random.nextInt(DOOR_NUMS);
        }
        return index;
    }

    /**
     * 参赛者改变选择，选择另一扇没有打开的门
     *
     * @param index
     * @return
     */
    private static int reDrawFromOthers(Integer... index) {
        List<Boolean> otherDoorList = new ArrayList<>(threeDoorList);
        for (Integer integer : index) {
            otherDoorList.remove(integer);
        }
        return random.nextInt(otherDoorList.size());
    }

    public static void main(String[] args) {
        for (int n = 1; n < 10; n++) {
            // 模拟次数
            int count = 100000*n;
            // 中间总次数
            int sum = 0;
            for (int m = 0; m < count; m++) {
                int firstIndex = drawOneCheck();
                int secondIndex = ownerDrawOneCheck(firstIndex);
                int lastIndex = reDrawFromOthers(secondIndex);

                if (!threeDoorList.get(firstIndex)){
                    sum++;
                }
//                if (threeDoorList.get(lastIndex)) {
//                    sum++;
//                }
            }
            BigDecimal d = new BigDecimal((double) sum/count);
            System.out.println("本次模拟共中奖概率" + d);
        }
    }
}
