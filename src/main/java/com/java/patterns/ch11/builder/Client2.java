package com.java.patterns.ch11.builder;

import java.util.ArrayList;

public class Client2 {

    public static void main(String[] args) {

        /**
         * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom"); //客户要求，run时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来

        // 要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        // 要一个宝马车
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }

}
