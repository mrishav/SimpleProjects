
public class CaesarCipher {

	public static void main(String[] args) {
	
		String code=encrypt("i like food",2);

		System.out.println(code);


	}
	public static String decrypt(String code, int key){
		code=encrypt(code,26-key);
		return code;
	}
	public static String encrypt(String message, int key){
		message=message.toLowerCase();
		char[]alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String newMessage="";
		boolean notInAlphabet=true;
		for(int x=0;x<message.length();x++)
		{
			notInAlphabet=true;
			for(int i=0;i<alphabet.length;i++){
				if (alphabet[i]==message.charAt(x))
				{
					if(i-key<0)
					{
						newMessage=newMessage+alphabet[i-key+26];
					}
					else {
						newMessage=newMessage+alphabet[i-key];
					}
					notInAlphabet=false;
				}
			}
			if(notInAlphabet)
			{
				newMessage=newMessage+message.charAt(x);
			}

		}

		return newMessage;
	}
}