package com.java.patterns.book1.ch19.adapter2;

public class SocketAdapter implements DBSocketInterface {

    private GBSocketInterface socketInterface;

    public SocketAdapter(GBSocketInterface socketInterface) {
        this.socketInterface = socketInterface;
    }

    @Override
    public void powerWithTwoRound() {
        socketInterface.powerWithThreeFlat();
    }
}
