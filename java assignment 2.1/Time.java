public class Time {
   
    private int hr;
    private int min;
    private int sec;

  
    public Time() {
        this.hr = 12;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

   
    public Time(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

   
    public void setClock(int secondsSinceMidnight) {
        this.hr = (secondsSinceMidnight / 3600) % 24;  
        this.min = (secondsSinceMidnight / 60) % 60;   
        this.sec = secondsSinceMidnight % 60;         
    }

    
    public void tick() {
        setClock(hr * 3600 + min * 60 + sec + 1); 
    }

    
    public void tickDown() {
        setClock(hr * 3600 + min * 60 + sec - 1); 
    }

   
    public void displayTime() {
       
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

   
    public static void main(String[] args) {
       
        Time t1 = new Time(); 
        Time t2 = new Time(5, 45, 23); 
        Time t3 = new Time(3723); 

        
        System.out.println("Initial Times:");
        t1.displayTime(); 
        t2.displayTime(); 
        t3.displayTime(); 

        
        t1.tick();
        t2.tick();
        t3.tick();

       
        System.out.println("Times after ticking:");
        t1.displayTime(); 
        t2.displayTime(); 
        t3.displayTime(); 

       
        t1.tickDown();
        t2.tickDown();
        t3.tickDown();

    
        System.out.println("Times after ticking down:");
        t1.displayTime(); 
        t2.displayTime(); 
        t3.displayTime(); 
    }
}
