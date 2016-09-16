
package com.bean.laba1;

public class BeanA {
    private String text;
    private String name;

    private BeanB B;

    public BeanA(String text) {
        this.text = text;
    }

    public void setB(BeanB b) {
        B = b;
    }

    public BeanB getB() {
        return B;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHi(){
        System.out.println(text);
    }
}