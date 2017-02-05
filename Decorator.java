import java.util.*;

public class Decorator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter the hourly rate: ");
		float HourlyRate = in.nextFloat();
		
		System.out.println("Please enter the surface area of the room: ");
		int Area = in.nextInt();
		
		System.out.println("Please enter the material unit cost: ");
		float UnitCostOfMaterials = in.nextFloat();
	
		System.out.println("Please enter the time required: ");
		int TimeNeeded = in.nextInt();
		
		Room theRoom = new Room (Area, TimeNeeded, UnitCostOfMaterials);
		Job theJob = new Job (theRoom, HourlyRate);
		
		float totalJobCost = theJob.calculateCostOfTheJob();
		
		System.out.println("The job will cost £" + totalJobCost);
				
	}

}
