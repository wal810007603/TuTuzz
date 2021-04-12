package week4;

public class UserDriver {

	public static void main(String[] args) {
		User u1 = new User("ÕÅÈý");
		User u2 = new User("ÀîËÄ", "lisi444");
		User u3 = new User("ÍõÎå", "wangwu555");

		u1.setPassword("zhangsan333");

		System.out.println(u1.info());
		System.out.println(u2.info());
		System.out.println(u3.info());
		System.out.println("ÓÃ»§¸öÊý:" + User.userNum());

	}

}
