public class Concert extends Events{

    private String information_performers;

    public Concert(String name_event, String location_event, int date_event_days, int date_event_months, int date_event_years,int time_event_hours, int time_event_minutes, String duration_event, String goal, String information_performers) {

        
        super(name_event, location_event, date_event_days, date_event_months, date_event_years,
              time_event_hours, time_event_minutes, duration_event, goal);

        
        this.information_performers = information_performers;
    }

    public void setInformation_performers(String information_performers){
        this.information_performers=information_performers;
    }

    public String getInformation_performers(){
        return information_performers;
    }

    @Override
    public String toString(){
        return super.toString()+"| Information on the performers :"+this.information_performers;
    }
}
