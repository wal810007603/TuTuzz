package week4;

public class User {
	// instance variable
	private String userName;
	private String password;
	private static int userNum = 0;

	// constructor
	public User() {
		super();
		userNum++;
	}

	public User(String userName) {
		super();
		this.userName = userName;
		userNum++;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		userNum++;
	}

	// instance method
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int userNum() {
		return userNum;
	}

	public String info() {
		String info = "ÓÃ»§Ãû:" + this.userName + "  ¿ÚÁî:" + this.password;
		return info;
	}

}
