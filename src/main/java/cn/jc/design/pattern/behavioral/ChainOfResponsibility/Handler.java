package cn.jc.design.pattern.behavioral.ChainOfResponsibility;

/**
 * Created by JC 2016/4/12.
 */
public abstract class Handler {

    /**
     * 后继者
     */
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    /**
     * 对象一致的处理请求
     * @param request
     */
    public abstract void HandleRequest(int request);
}
