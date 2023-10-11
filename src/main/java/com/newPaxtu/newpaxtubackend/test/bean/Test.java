package com.newPaxtu.newpaxtubackend.test.bean;

public class Test {
    private final String ping;

    public Test(String ping) {
        super();
        this.ping = ping;
    }

    public String getPing() {
        return ping;
    }

    @Override
    public String toString() {
        return "Test{" +
                "ping='" + ping +
                '}';
    }
}
