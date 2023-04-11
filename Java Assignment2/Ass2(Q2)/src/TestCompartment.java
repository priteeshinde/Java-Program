
public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartment=new Compartment[10];
		compartment[0]=new FirstClass();
		compartment[1]=new General();
		compartment[2]=new Ladies();
		compartment[3]=new Luggage();
		compartment[4]=new FirstClass();
		compartment[5]=new General();
		compartment[6]=new Ladies();
		compartment[7]=new Luggage();
		compartment[8]=new FirstClass();
		compartment[9]=new General();

		for (int i = 0; i < compartment.length; i++) {
		    compartment[i].notice();
		}
	}

}
