
class Radio
{
	
	private String name;
	private String type;
	private double frequency;
	
	
	void initialize()
	{
		name=null;
		type=null;
		frequency=0.0;
	}
	
	public Radio()
	{
		name="Pal Fm";
		type="Nostalgia";
		frequency=92.4;
	}
	
	public Radio(String nameR)
	{
		name=nameR;	
	}
	
	public Radio(String nameR, double freq)
	{
		name=nameR;
		frequency=freq;
	}
	
	public Radio (String nameR, String typeR, double freq)
	{
		name=nameR;
		frequency=freq;
		type=typeR;
	}
	
	public void display(Radio object)
	{
		System.out.println("Radio Name: "+object.name);
		System.out.println("Radio Type: "+object.type);
		System.out.println("Radio Frequency: "+object.frequency);
	}
	
	public double getFrequency()
	{
		return frequency;
	}
	
	
	public void setFrequency(double frequency)
	{
		this.frequency=frequency;
	}
	
}