package cn.jc.design.pattern.ChainOfResponsibility;


/**
 * Created by JC on 2016/4/12.
 */
public class ConcreteHandlerOne extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request > 0 && request < 10){
            System.out.println(
            		String.format("%s 处理请求 %s", this.getClass().getName(), request));
        }else if (successor != null) {
        	//转移到后继者处理请求
			successor.HandleRequest(request);
		}
    }
}
