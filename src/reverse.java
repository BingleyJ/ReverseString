
public class reverse {

	public static String rev(String inStr){
		if ((inStr == null) || inStr.length() <= 1){
			return inStr;
		}
		String tempStr = rev(inStr.substring(1)) + inStr.charAt(0);
		System.out.println("reversed = " + tempStr);
		return tempStr;
	}
	
	public static void main(String[] args) {
		String str = "12345";
		System.out.println("To be reversed = " + str);
		rev(str);
	}

}
