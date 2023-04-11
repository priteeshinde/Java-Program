
public class instrumentMain {

	public static void main(String[] args) {
		instrument[] instruments = new instrument[10];
		instruments[0] = new Piano();
		instruments[1] = new Flute();
		instruments[2] = new Guiter();
		instruments[3] = new Piano();
		instruments[4] = new Flute();
		instruments[5] = new Guiter();
		instruments[6] = new Piano();
		instruments[7] = new Flute();
		instruments[8] = new Guiter();
		instruments[9] = new Piano();
		
		for (int i = 0; i < instruments.length; i++) {
		    instruments[i].Play();
		}
		
		for (int i = 0; i < instruments.length; i++) 
		{
		    if (instruments[i] instanceof Piano) 
		    {
		        System.out.println("Object at index " + i + " is a Piano");
		    } 
		    else if (instruments[i] instanceof Flute) 
		    {
		        System.out.println("Object at index " + i + " is a Flute");
		    } 
		    else if (instruments[i] instanceof Guiter) 
		    {
		        System.out.println("Object at index " + i + " is a Guitar");
		    } 
		    else 
		    {
		        System.out.println("Object at index " + i + " is not an Instrument");
		    }
		}
	}
}
