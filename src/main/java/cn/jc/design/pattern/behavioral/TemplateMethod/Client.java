package cn.jc.design.pattern.behavioral.TemplateMethod;

/**
 * Created by JC on 2016/4/14.
 */
public class Client {
    public static void main(String[] args){
        AbstractClass abstractClass;
        abstractClass = new ConcreteClassA();
        abstractClass.TemplateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.TemplateMethod();
    }
}
