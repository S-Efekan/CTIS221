
class Radio {
	String name;
	String type;
	double frequency;
	
	
	void initialize() {
		name=null;
		type=null;
		frequency=0.0;
	}
	
	Radio(){
		name="Pal Fm";
		type="Nostalgia";
		frequency=92.4;
	}
	
	Radio(String nameR){
		name=nameR;	
	}
	
	Radio(String nameR, double freq){
		name=nameR;
		frequency=freq;
	}
	
	Radio (String nameR, String typeR, double freq){
		name=nameR;
		frequency=freq;
		type=typeR;
	}
}
