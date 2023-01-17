public class Main {
    public static void main(String[] args) {

        Clock clock=new Clock();
        while(true){
            System.out.println(clock);
            clock.advanceClock();

        }



     /*   ClockHand hours=new ClockHand(24);
        ClockHand min=new ClockHand(60);
        ClockHand sec=new ClockHand(60);

        while (true) {
            System.out.println(hours+":"+min+":"+sec);
            sec.increase();
            if(sec.value()==0) {
                min.increase();

                if (min.value() == 0) {
                    hours.increase();
                }
            }
        }

        int hour=0;
        int min=0;
        int sec=0;

        while(true){

            if(hour>10){
                System.out.print(0);
            }
            System.out.print(hour);
            System.out.print(":");

            if(min>10){
                System.out.print(0);
            }
            System.out.print(min);
            System.out.print(":");

            if (sec>10){
                System.out.print(0);
            }
            System.out.print(sec);
            System.out.println("");

            sec=sec+1;

            if(sec>59){
                min=min+1;
                sec=0;
            }
            if(min>59){
                hour=hour+1;
                min=0;
            }
            if(hour>=24){
                hour=0;
            }

        }


*/


    }
}