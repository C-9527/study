package 代理模式.cglib代理.proxy;

/**
 * @author 25675
 */
public class TeacherDao {

	public String teach() {
		System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
		return "hello";
	}
}
