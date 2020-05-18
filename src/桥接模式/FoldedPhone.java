package 桥接模式;



/**
 * 折叠式手机类，继承 抽象类 Phone
 * @author 25675
 */
public class FoldedPhone extends Phone {


	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	@Override
	public void open() {
		System.out.print(" 折叠样式手机， ");
		super.open();
	}
	
	@Override
	public void close() {
		System.out.print(" 折叠样式手机， ");
		super.close();
	}
	
	@Override
	public void call() {
		System.out.print(" 折叠样式手机， ");
		super.call();
	}
}
