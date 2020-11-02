package class14;

public class NetworkCard implements PCI
{

	@Override
	public void start()
	{
		System.out.println("Sending data");
		
	}

	@Override
	public void stop()
	{
		System.out.println("Stop network");
		
	}

}
