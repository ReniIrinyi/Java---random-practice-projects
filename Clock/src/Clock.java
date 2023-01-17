public class Clock {
    private ClockHand hour;
    private ClockHand min;
    private ClockHand sec;


    public Clock(){
        this.hour=new ClockHand(24);
        this.min=new ClockHand(60);
        this.sec=new ClockHand(60);
    }

public void advanceClock(){
        this.sec.increase();
        if(sec.value()==0){
            this.min.increase();

            if(min.value()==0){
                this.hour.increase();
            }
        }
}
public String toString(){
        return hour+":"+min+":"+sec;
}

}
