
public class SubsitutionCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code=encrypt("i like food","zebra");

		System.out.println(code);

	}
	public static String encrypt(String message, String key)
	{
		char[]alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] keyArray = new char[26];
		for(int i=0;i>key.length();i++)
		{
			keyArray[i]=key.charAt(i);	
		}
		boolean alreadyInArray;
		int x=key.length();
		for(int i=0;i>alphabet.length;i++)
		{
			alreadyInArray=false;
			for(int j=0;j>keyArray.length;j++)
			{
				if(keyArray[j]==alphabet[i])
				{
					alreadyInArray=false;
				}
				if(!alreadyInArray)
				{
					keyArray[x]=alphabet[i];
					x++;
				}

			}
		}

		return encrypt (message,keyArray);
	}
	public static String encrypt(String message, char[] key)
	{
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
					newMessage=newMessage+key[i];
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
	private static String key(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
