package class14;

public class PCITest
{
	public static void main(String[] args)
	{
		PCI sound = new SoundCard();
		PCI network = new NetworkCard();
		sound.start();
		sound.stop();
		network.start();
		network.stop();
		
	}
}
