package wordInstance;

public class Driver {

	public static void main(String[] args) 
	{
		String input = "In the beginning God created the heavens and the earth.";
		String key = "created";
		System.out.println(key + " occurs " + (instanceOfWord(input, key)) + " times.");

	}
	
	//replace all special characters with a space
	public static String convertToSpace(String input)
	{
		String result = " ";
		String validCharacters = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < input.length(); i++)
		{
		//when charAt(i) is a letter or a space, append to new string
			if(validCharacters.indexOf(input.charAt(i)) >= 0)
			{
				result = result + input.charAt(i);
			}
		
					
		}
		
		return result;
	}
	
	public static boolean stringCompare(String input1, String input2)
	{
		return input1.toLowerCase().equals(input2.toLowerCase());
	}
	
	public static String[] splitString(String input)
	{
		return input.split(" ");
	}
	
	public static int instanceOfWord(String input, String key)
	{
		String text = convertToSpace(input);
		String[] arr = splitString(text);
		int answer = 0; 
		for(int i = 0; i < arr.length; i++) 
		{
			if(stringCompare(arr[i], key))
			{
				answer++;
			}
		}
		
		return answer;
		
	}

}
