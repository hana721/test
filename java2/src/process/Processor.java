package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processor {
    private String message1;
    private String message2;
    private Date currentDate;

    public Processor() {
        this.message1 = "こんにちは！ここは日本です！";
        this.message2 = "この寿司はうまい";
        this.currentDate = new Date();
    }

    public void processData() {
        System.out.println(this.message1);
        System.out.println(this.message2);
        System.out.println("寿司は和食です");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("今の現在日時は" + sdf.format(this.currentDate) + "です");
    }
}
