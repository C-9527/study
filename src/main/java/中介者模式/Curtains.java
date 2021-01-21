package 中介者模式;

import 中介者模式.colleague.Colleague;
import 中介者模式.mediator.Mediator;

/**
 * @author 25675
 * 窗帘
 */
public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

}
