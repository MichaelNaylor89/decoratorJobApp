
public class Room {

	int surfaceArea;
	int timeRequired;
	float costOfMaterial;
	
	public Room (int SA, int TR, float CoM)
	{
		surfaceArea = SA;
		timeRequired = TR;
		costOfMaterial = CoM;
	}
	
	public float calculateCost(float hourlyRate)
	{
		float totalMaterialCost = surfaceArea * costOfMaterial;
		float totalTimeCost = timeRequired * hourlyRate;
		float totalCost = totalMaterialCost + totalTimeCost;
		return totalCost;
	}
}
