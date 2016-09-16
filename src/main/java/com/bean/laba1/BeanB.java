package com.bean.laba1;

/**
 * Created by 111 on 14.09.2016.
 */
public class BeanB {

    private String text;
    private String name;

    public BeanB() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi(){
        System.out.println(text);
    }

}
