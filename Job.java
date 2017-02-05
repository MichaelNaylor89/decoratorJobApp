
public class Job{

	Room theRoom;
	float hourlyRate;
	
	Job (Room R, float HR)
	{
		this.theRoom = R;
		this.hourlyRate = HR;
	}
	
	public float calculateCostOfTheJob()
	{
		return theRoom.calculateCost(hourlyRate);
	}
}
