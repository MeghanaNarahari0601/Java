import java.util.List;
import java.util.ArrayList;

public class Application{
public static void main(String[] args){

   Participant p1 = new Participant("Meghana", "503-645-8889");
   Participant p2 = new Participant("Sourabh", "503-533-2071");

   Program pg1 = new Program(30,"Superstars","3:15");
   
    System.out.println(p1.getName());

    pg1.addParticipant(p1);
    pg1.addParticipant(p2);

   ArrayList<Participant> list = pg1.getParticipants();
   for(int i=0 ; i<list.size() ; i++){
       System.out.println(list.get(i).getName());
   }
   
    
}
}