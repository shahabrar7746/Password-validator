import java.util.*;

//import com.sun.tools.javac.platform.PlatformDescription;


public class password_validetator {
	//This method will add character or number at Specific index will return a string containing suggested password
	//This method will take parameters String and a character in order to generate suggested password 
	
	static String rmd(String pswd,char msg) {
		char sgsd[] = new char[pswd.length()+2];
		for(int i = 0;i<pswd.length();i++) {
			sgsd[i] = pswd.charAt(i);
		}
		Random rd = new Random();
		sgsd[rd.nextInt(pswd.length())] = msg;
		String temp = "";
		String ans = "";
		for(int i = 0;i<sgsd.length;i++) {
		ans = ans + temp.valueOf(sgsd[i]);
			
		}
		
	
		return ans;
	}
//This method will generate suggested passowrd for user if any spaces found in input
	//As both the method are static they won't require object for execution 
	
	static String rmd() {
		Random rd = new Random();
		String taker = "!@$%^&*124567890QWERTYUIOPASDFGHJKLZXVBNMqwertyuiopasdfghjklzxvbnm#3cC";
	//	char sgsd[] = new char[14];
		String temp = "";
		String sgsd = "";
		for(int i = 0;i<14;i++) {
		sgsd = sgsd + temp.valueOf(taker.charAt(rd.nextInt(taker.length())));
			
		}
		
		return sgsd;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
		    System.out.print("Your Password :");
//		This Password vvariable will contain our user password on which operation are going to take place   
	String password = s.nextLine();
	String temp = "";
	//This  nums variable will be used by rd method in order to generate suggested password using rmd method which takes parameter of string and character
	String nums = "1245678903";
	boolean ans = false;
	String nums1 = "!@$%^&*()#";
	Random rd = new Random();
	boolean for_nums = false;
	boolean for_cha = false;
	//If the user password contains any spaces or having length more than 14 then is if statement will be executed and it will say that status in is invalid and the solution for that will be must not contain any spaces and then a method and you will be called which don't take any parameter this method will generate a random suggested passwords
	if(password.contains(" ") | password.length()>14){
	System.out.println("Status        :Invalid");
	if(password.contains(" ")) {
    System.out.println("Warning       :Should not contain any spaces");
		System.out.println("Suggested passwword  :" + rmd());
	}
	
	}else{
		/*
		 * If the user password does not contain any spaces or having length less than 14
		 *  then else statement will be executed then for loop will be Run to check if there is any number in user password if found yes
		 *   then first
		 *  it will check the Boolean as true and it will break the loop
		 */
	for(int i = 0;i<nums.length();i++){
	    if(password.contains(temp.valueOf(nums.charAt(i)))){
	        ans = true;
	        for_nums = true;
	       
	        break;
	    }else{
	        ans = false;
	    }
	}
	
	for(int i = 0;i<nums1.length();i++){
	    if(password.contains(temp.valueOf(nums1.charAt(i)))){
	        ans = true;
	      
	        for_cha =true;
	        break;
	    }else{
	        ans = false;
	    }
	}
	/*
	 * Now the code where run for loop to check if there is any special character if found yes 
	 * then it will make a condition true and will break the loop
	 */
	
	/*
	 * Now if statement will check if the both condition comes true then it will say that the status is valid 
	 * if both of them or one of them come fast then you will see status as invalid
	 */
	if(ans && for_cha && for_nums){
		
	    System.out.println("Status        :Valid");
		
	}else{
		 System.out.println("Status        :Invalid");
		if(!for_nums  | !for_cha) {
			if(!for_nums) {
				/*
				 * If status comes invalid then code will check which of them comes false if  nums comes falsethen it will pass a user password and a character rmd method which will generate suggested faster using the given parameter. This 
 Character will be given by random object to rmd method
				 */
			    System.out.println("Problem       :Must contain atleast one number ");
			    System.out.println("Solution       :Add atleast one number ");
				System.out.println("Suggested password    :" + rmd(password,nums.charAt(rd.nextInt(nums.length()))));
			}else {
				if(!for_cha) {
/*
 * If if nums comes true you then it will check ok for or character Boolean if found true you then it will pass a string
 *  and character rmd method using random object to generate suggested password
 */
				    System.out.println("Problem       :Must contain atleast one special charater ");
				    System.out.println("Solution      :Add atleast one special character ");
					System.out.println("Suggested password   :"  +rmd(password,nums1.charAt(rd.nextInt(nums1.length()))));
				}else {
					System.out.println("problem       :Unknown");
					System.out.println("Solution       : Enter a valid password");
				}
			}
		}
	   
	}
	}
	}

}
