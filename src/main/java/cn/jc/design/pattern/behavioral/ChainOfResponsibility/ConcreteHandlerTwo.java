package cn.jc.design.pattern.behavioral.ChainOfResponsibility;

public class ConcreteHandlerTwo extends Handler {

	@Override
	public void HandleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println(
            		String.format("%s 处理请求 %s", this.getClass().getName(), request));
        }else if (successor != null) {
        	//转移到后继者处理请求
			successor.HandleRequest(request);
		}
	}

}
