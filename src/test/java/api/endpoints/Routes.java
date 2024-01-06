package api.endpoints;
/*
 * URL=  https://petstore.swagger.io
 * Create User(Get) = https://petstore.swagger.io/v2/user/{username}
 * Update user (Put) =https://petstore.swagger.io/v2/user/{username}
 * Delete user (Delete) = https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";
	
	//user module
	
	public static String post_url = base_url+"/user";
	public static String get_url= base_url+"/user/{username}";
	public static String update_url= base_url+"/user/{username}";
	public static String delete_url= base_url+"/user/{username}";
	
	//Store module
	
	   //here you will create store module URL's
	
	//Pet module
	      //here you will create pet module URL's
}
