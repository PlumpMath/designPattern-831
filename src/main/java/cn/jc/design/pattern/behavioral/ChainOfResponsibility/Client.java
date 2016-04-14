package cn.jc.design.pattern.behavioral.ChainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		Handler h1 = new ConcreteHandlerOne();
		Handler h2 = new ConcreteHandlerTwo();
		Handler h3 = new ConcreteHandlerThree();
		
		//设置chain
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };
		for (int request : requests) {
			h1.HandleRequest(request);
		}
	}

}
