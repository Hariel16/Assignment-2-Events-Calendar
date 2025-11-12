public class Events{

    //Attributes fields
    private String name_event;
    private String location_event;
    private String date_event;
    private int date_event_days;
    private int date_event_months;
    private int date_event_years;
    private String time_event;
    private int time_event_hours;
    private int time_event_minutes;
    private String duration_event;
    private String goal;
    
    //Methods

     public void FormatDate(int date_event_days,int date_event_months,int date_event_years){
        this.date_event_days = date_event_days;
        this.date_event_months = date_event_months;
        this.date_event_years = date_event_years;
        if(date_event_days < 1 || date_event_days > 31 || date_event_months < 1 || date_event_months > 12 || date_event_years < 2025){
            this.date_event="01 January 2000";
        }
        else{
            switch (this.date_event_months) {
                case 1:
                    this.date_event= this.date_event_days+" January "+this.date_event_years;
                    break;
                case 2:
                    if (this.date_event_days==30||this.date_event_days==31){
                        this.date_event= 28+" February "+this.date_event_years;
                    }
                    else{
                        this.date_event= this.date_event_days+" February "+this.date_event_years;
                    }
                    break;
                case 3:
                    this.date_event= this.date_event_days+" March "+this.date_event_years;
                    break;
                case 4:
                    if (this.date_event_days==31){
                        this.date_event= 30+" April "+this.date_event_years;
                    }
                    else{
                        this.date_event= this.date_event_days+" April "+this.date_event_years;
                    }
                    break;
                case 5:
                    this.date_event= this.date_event_days+" May "+this.date_event_years;
                    break;
                case 6:
                    if (this.date_event_days==31){
                            this.date_event= 30+" June "+this.date_event_years;
                        }
                    else{
                            this.date_event= this.date_event_days+" June "+this.date_event_years;
                        }
                    break;
                case 7:
                    this.date_event= this.date_event_days+" July "+this.date_event_years;
                    break;
                case 8:
                    if (this.date_event_days==31){
                            this.date_event= 30+" August "+this.date_event_years;
                        }
                    else{
                            this.date_event= this.date_event_days+" August "+this.date_event_years;
                        }
                    break;
                case 9:
                    this.date_event= this.date_event_days+" September "+this.date_event_years;
                    break;
                case 10:
                    if (this.date_event_days==31){
                            this.date_event= 30+" October "+this.date_event_years;
                        }
                    else{
                            this.date_event= this.date_event_days+" October "+this.date_event_years;
                        }
                    break;
                case 11:
                    this.date_event= this.date_event_days+" November "+this.date_event_years;
                    break;
                case 12:
                     if (this.date_event_days==31){
                            this.date_event= 30+" December "+this.date_event_years;
                        }
                    else{
                            this.date_event= this.date_event_days+" December "+this.date_event_years;
                        }
                    break;
            }
           
        }
    }

    public void FormateTime(int time_event_hours, int time_event_minutes){
        this.time_event_hours=time_event_hours;
        this.time_event_minutes=time_event_minutes;
        if (time_event_hours < 0 || time_event_hours > 23 || time_event_minutes < 0 || time_event_minutes > 59) {
            this.time_event = "Invalid time";
        } else {
            this.time_event = time_event_hours + ":" + time_event_minutes;
        }
    }

    public void FormateDuration(String duration_event){
        this.duration_event=duration_event;
        if (!(duration_event.endsWith("hours")||duration_event.endsWith("minutes"))){
            this.duration_event="the duration of this event has not been defined";
        }
        else{
            this.duration_event=duration_event;
        }
    }

    //Constructors
    
    public Events(){
        name_event="No Name";
        date_event="01 January 2000";
        duration_event="1 hours";
        goal="The goal of this event event have not been precised";
    }

    public Events(String name_event,String location_event,int date_event_days,int date_event_months,int date_event_years,int time_event_hours,int time_event_minutes,String duration_event,String goal){
        
        this.name_event = name_event;

        this.location_event = location_event;

        FormatDate(date_event_days, date_event_months, date_event_years);
        FormateTime(time_event_hours, time_event_minutes);
        FormateDuration(duration_event);

        this.goal = goal;


    }

    //Setters

    public void setName_event(String name_event){
        this.name_event=name_event;
    }

    public void setLocation_event(String location_event){
        this.location_event=location_event;
    }

    public void setDate_event(int date_event_days,int date_event_months,int date_event_years){
       FormatDate(date_event_days,date_event_months,date_event_years);
    }

    public void setTime_event(int time_event_hours,int time_event_minutes){
        FormateTime(time_event_hours,time_event_minutes);
    }

    public void setDuration_event(String duration_event){
        FormateDuration(duration_event);
    }

    public void setGoal(String goal){
         this.goal=goal;
    }

    //Getters

    public String getName_event(){
        return name_event;
    }

     public String getLocation_event(){
        return location_event;
    }

     public String getDate_event(){
        return date_event;
    }

     public String getTime_event(){
        return "Time of the event: "+time_event;
    }

     public String getDuration_event(){
        return duration_event;
    }

     public String getGoal(){
        return goal;
    }

    //Description of each event
    @Override
    public String toString(){
        return "Name of the Event: "+this.name_event+"| Event Location : "+this.location_event+"| Date of the event :"+this.date_event+"| Time of the Event: "+this.time_event+"| The duration of this event: "+this.duration_event+"|The goal of this event: "+this.goal;

    }

    

}

