public class Party extends Events{

    private String theme_party;

    public Party(String name_event, String location_event, int date_event_days, int date_event_months, int date_event_years,int time_event_hours, int time_event_minutes, String duration_event, String goal, String theme_party) {

        
        super(name_event, location_event, date_event_days, date_event_months, date_event_years,
              time_event_hours, time_event_minutes, duration_event, goal);

        
        this.theme_party = theme_party;
    }


    public void setTheme_party(String theme_party){
        this.theme_party=theme_party;
    }

    public String getTheme_party(){
        return theme_party;
    }

    @Override
    public String toString(){
        return super.toString()+"| Theme of the party:"+this.theme_party;
    }
   
}

