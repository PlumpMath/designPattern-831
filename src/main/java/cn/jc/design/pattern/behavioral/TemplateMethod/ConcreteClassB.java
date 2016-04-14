package cn.jc.design.pattern.behavioral.TemplateMethod;

/**
 * Created by JC on 2016/4/14.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void PrimitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    protected void PrimitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
