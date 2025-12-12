package Activity1;

public class Training {
	String Name; 
	MyDate StartDate , EndDate;
	String TrainerName;
	int TotalParticipants;
	String Stream;
	Attendance attend;
	
	public Training(String name, MyDate startDate, MyDate endDate, String trainerName, int totalParticipants,
			String stream, Attendance attend) {
		Name = name;
		StartDate = startDate;
		EndDate = endDate;
		TrainerName = trainerName;
		TotalParticipants = totalParticipants;
		Stream = stream;
		this.attend = attend;
	}
	@Override
	public String toString() {
		return "Training [Name=" + Name + ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", TrainerName="
				+ TrainerName + ", TotalParticipants=" + TotalParticipants + ", Stream=" + Stream + ", attend=" + attend
				+ "]";
	}
	
}
