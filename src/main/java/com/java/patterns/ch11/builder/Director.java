package com.java.patterns.ch11.builder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /*
     */
    public BenzModel getABenzModel() {
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("engine Boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }


    public BMWModel getCBMWModel() {
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("start");
        //按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }
}
