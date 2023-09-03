package pack;
class account{
	public String username;
	private String password;
	
	public String getpassword() {
		return this.password;
	}
	
	public void setpassword(String pass) {
		this.password=pass;
	}
	public void username(String username) {
		System.out.println(username);
	}
}
public class Access {
    public static void main(String[] args) {
		account sc=new account();
//		sc.username="suraj";
		sc.setpassword("password@123");
		sc.username("suraj");
		System.out.println(sc.getpassword());
		
		
	}

}
