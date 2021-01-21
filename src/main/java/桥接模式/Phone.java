package 桥接模式;

/**
 * 相同的方法父类实现，避免代码重复
 */
public abstract class Phone {

	/**
	 * 组合品牌
	 */
	private Brand brand;

	/**
	 * 构造器
	 */
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
