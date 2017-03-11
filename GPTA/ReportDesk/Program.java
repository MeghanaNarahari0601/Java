import java.util.List;
import java.util.ArrayList;

class Program{
    int duration;
    String programName;
    String startTime;
    ArrayList<Participant> participants; 
    
    public Program(int duration , String programName, String startTime){

        this.duration = duration;
        this.programName = programName;
        this.startTime = startTime;
        this.participants = new ArrayList<Participant>();
    }

    public void addParticipant(Participant p1){
        participants.add(p1);
    }
    
    public ArrayList<Participant> getParticipants(){
        return participants;
    }
}