package fb_Test_execution;
import fb_Page_execution.page_value;
public class Test_execution_final extends page_value

{
    public static void main(String[] args) 
	{
		Browser_launch();
		enter_emailid("Abhishek");
		enter_password("Abhishek@567");
		login();
	}
}
