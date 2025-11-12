public class Talk extends Events{

    private String information_speaker;
    private String abstract_talk;

    public Talk(String name_event, String location_event, int date_event_days, int date_event_months, int date_event_years,int time_event_hours, int time_event_minutes, String duration_event, String goal, String information_speaker,String abstract_talk) {

        
        super(name_event, location_event, date_event_days, date_event_months, date_event_years,
              time_event_hours, time_event_minutes, duration_event, goal);

        
        this.information_speaker = information_speaker;
        this.abstract_talk=abstract_talk;
    }

    public void setInformation_speaker(String information_speaker){
        this.information_speaker=information_speaker;
    }

    public void setAbstract_talk(String abstract_talk){
        this.abstract_talk=abstract_talk;
    }

    public String getInformation_speaker(){
        return information_speaker;
    }

    public String getAbstract_talk(){
        return abstract_talk;
    }

    @Override
    public String toString(){
        return super.toString()+"| Information on the speaker :"+this.information_speaker+ "| The Abstract of the talk :"+this.abstract_talk;
    }
}