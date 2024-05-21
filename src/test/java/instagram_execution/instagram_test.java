package instagram_execution;
import instagram_page.instagram_value;
public class instagram_test extends instagram_value 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Browser_launch();
	    enter_phonenumber("8919045082");
		enter_password("Abhishek@567");
		login();
		Thread.sleep(9000);
	}
}
