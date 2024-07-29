import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class clock extends Thread {
    public void run(){
DateTimeFormatter d= DateTimeFormatter.ofPattern("hh:mm:ss");
// System.out.println(d.format(java.time.LocalDateTime.now()));
while (true) { 
    
    try {
        
    Thread.sleep(1000);
    LocalTime currentTime = LocalTime.now();
    System.out.println(d.format(currentTime));
    System.out.flush();
    } catch (Exception e) {
        System.out.println(e);
    }
}
    }
    public static void main(String[] args) {
        clock clk = new clock();
        Thread t = new Thread();
        t.start();
    }
}
