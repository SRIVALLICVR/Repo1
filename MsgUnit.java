package Problem1;
public class Msgunit{
	private String message;
	public Msgunit(String message)
	{
		this.message=message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}