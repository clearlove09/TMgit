package testGit;

public class User {
	
	private Integer userAge;
	private String name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userAge, String name) {
		super();
		this.userAge = userAge;
		this.name = name;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userAge=" + userAge + ", name=" + name + "]";
	}

}
