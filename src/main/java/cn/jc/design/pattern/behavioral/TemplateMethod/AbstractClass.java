package cn.jc.design.pattern.behavioral.TemplateMethod;

/**
 * Created by JC on 2016/4/14.
 * 定义一个算法的骨架
 */
public abstract class AbstractClass {
    protected abstract void PrimitiveOperation1();
    protected abstract void PrimitiveOperation2();

    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println();
    }
}
