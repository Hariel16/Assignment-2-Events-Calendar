public class Driver {
    
     public static void main(String[] args) {
        
        Events[] List_Of_Events = new Events[10];

        Sports hariel=new Sports("Champions League Final", "Camp Nou", 26, 7, 2025, 19, 15, "4 hours", "Social", "Football ", "Fc Barcelona will face Real Madrid for the first time in the champions league history and we will an opposition between Yamal and Kylian Mbappe");

        
        System.out.println(hariel.toString());

        
        //for(Events events:List_Of_Events){
            //System.out.println(events.toString());
        //}

        
    }
}
