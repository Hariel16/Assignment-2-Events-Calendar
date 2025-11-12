public class Recruitment extends Events{

    private String information_company;

    public Recruitment(String name_event, String location_event, int date_event_days, int date_event_months, int date_event_years,int time_event_hours, int time_event_minutes, String duration_event, String goal, String information_company) {

        
        super(name_event, location_event, date_event_days, date_event_months, date_event_years,
              time_event_hours, time_event_minutes, duration_event, goal);

        
        this.information_company = information_company;
    }

    public void setInformation_company(String information_company){
        this.information_company=information_company;
    }

    public String getInformation_company(){
        return information_company;
    }

     @Override
    public String toString(){
        return super.toString()+"| Information on the company :"+this.information_company;
    }
}