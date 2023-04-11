
public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicine=new Medicine[3];
		medicine[0]=new Tablet();
		medicine[1]=new Syrup();
		medicine[2]=new Ointment();
		
		for(int i=0;i<medicine.length;i++)
		{
			medicine[i].displayLabel();
		}
		
		for (int i = 0; i < medicine.length; i++) 
		{
		    if (medicine[i] instanceof Tablet) 
		    {
		        System.out.println("Object at index " + i + " is a Tablet");
		    } 
		    else if (medicine[i] instanceof Syrup) 
		    {
		        System.out.println("Object at index " + i + " is a Syrup");
		    } 
		    else if (medicine[i] instanceof Ointment) 
		    {
		        System.out.println("Object at index " + i + " is a Ointment");
		    } 
		    else 
		    {
		        System.out.println("Object at index " + i + " is not an medicine");
		    }
		}

	}

}
