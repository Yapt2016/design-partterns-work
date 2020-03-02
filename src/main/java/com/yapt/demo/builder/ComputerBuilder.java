package com.yapt.demo.builder;

/**
 * @author hurui
 * @version Id: ComputerBuilder.java, v 0.1 2020/3/2 21:48 YaphetS Exp $$
 */
public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder setZhuBan(String zhuBan){
        computer.setZhuBan(zhuBan);
        return this;
    }


    public ComputerBuilder setXianKa(String xianKa){
        computer.setXianKa(xianKa);
        return this;
    }

    public ComputerBuilder setChuLiQi(String chuLiQi){
        computer.setChuLiQi(chuLiQi);
        return this;
    }

    public ComputerBuilder setNeiCun(String neiCun){
        computer.setNeiCun(neiCun);
        return this;
    }

    public Computer build(){
        return computer;
    }

}