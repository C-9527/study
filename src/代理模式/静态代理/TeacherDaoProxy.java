package 代理模式.静态代理;

//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao{

	private ITeacherDao target; // 目标对象，通过接口来聚合


	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("准备授课。。。。。 ");//方法
		target.teach();
		System.out.println("提交。。。。。");//方法
	}

}
