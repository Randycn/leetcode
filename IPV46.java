package test;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class test {
	public static void main(String []args) {

        System.out.println(IsValiteAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }

	public static String IsValiteAddress(String string)
	{
		if(string.contains(".")) {
			String[] strings = string.split("\\.");
			if(strings.length == 4&& !string.startsWith(".") && !string.endsWith(".")) {
				for (int i = 0; i < strings.length; i++) {
					if(!strings[i].startsWith("0"))
					{
						try {
							int num = Integer.parseInt(strings[i]);
							if(num < 0 || num > 255)
							{
								return "Neither";
							}
						} catch (Exception e) {
							// TODO: handle exception
							return "Neither";
						}
						
					}
					else {
						return "Neither";
					}
				}
			}else {
				return "Neither";
			}
            return "IPv4";
			
		}else if(string.contains(":")) {
			String[] strings = string.split(":");
			if(strings.length == 8 && !string.startsWith(":") && !string.endsWith(":"))
			{
				for (int i = 0; i < strings.length; i++) {
					if(strings[i].length() <= 5 && strings[i].length() > 0)
					{
						try {
							int num = Integer.parseInt(strings[i], 16);
						} catch (Exception e) {
							// TODO: handle exception
							return "Neither";
						}
					}else {
						return "Neither";
					}
				}
			}else {
				return "Neither";
			}
            return "IPv6";
		}
		
		return "Neither";
			
	}
	
	
 
}
//insert a line in local branch
//insert another line
