public class Sports extends Events{

    private String information_sports;
    private String information_teams;

    public Sports(String name_event, String location_event, int date_event_days, int date_event_months, int date_event_years,int time_event_hours, int time_event_minutes, String duration_event, String goal, String information_sports,String information_teams) {

        
        super(name_event, location_event, date_event_days, date_event_months, date_event_years,
              time_event_hours, time_event_minutes, duration_event, goal);

        
        this.information_sports = information_sports;
        this.information_teams=information_teams;
    }

    public void setInformation_sports(String information_sports){
        this.information_sports=information_sports;
    }

    public void setInformation_teams(String information_teams){
        this.information_teams=information_teams;
    }

    public String getInformation_sports(){
        return information_sports;
    }

    public String getInformation_teams(){
        return information_teams;
    }

     @Override
    public String toString(){
        return super.toString()+"| information on the sports :"+this.information_sports+"| Information on the teams: "+this.information_teams;
    }

}