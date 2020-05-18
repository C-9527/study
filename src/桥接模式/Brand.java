package 桥接模式;

/**
 * 手机品牌功能接口
 * @author 25675
 */
public interface Brand {
	/**
	 * 手机开机
	 */
	void open();

	/**
	 * 手机关机
	 */
	void close();

	/**
	 * 打电话
	 */
	void call();
}
