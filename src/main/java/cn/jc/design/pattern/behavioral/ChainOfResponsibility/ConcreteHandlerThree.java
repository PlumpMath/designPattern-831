package cn.jc.design.pattern.behavioral.ChainOfResponsibility;

public class ConcreteHandlerThree extends Handler{
	@Override
	public void HandleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(
            		String.format("%s 处理请求 %s", this.getClass().getName(), request));
        }else if (successor != null) {
        	//转移到后继者处理请求
			successor.HandleRequest(request);
		}
	}
}
