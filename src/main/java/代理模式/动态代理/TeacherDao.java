package 代理模式.动态代理;

/**
 * @author 25675
 */
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(" 老师授课中.... ");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello " + name);
	}

}
