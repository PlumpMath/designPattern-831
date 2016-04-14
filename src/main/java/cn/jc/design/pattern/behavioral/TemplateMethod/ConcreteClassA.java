package cn.jc.design.pattern.behavioral.TemplateMethod;

/**
 * Created by JC on 2016/4/14.
 * 实现父类中的原语方法
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    protected void PrimitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    protected void PrimitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
