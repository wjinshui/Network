package class13;

public class InstrumentTest
{
	
	void testPlay(Instrument instrument)
	{
		instrument.play();
	}
	
	public static void main(String[] args)
	{
		InstrumentTest instrumentTest = new InstrumentTest();
		Piano piano = new Piano();
		Violin violin = new Violin();
		instrumentTest.testPlay(piano);
		instrumentTest.testPlay(violin);

	}
}
