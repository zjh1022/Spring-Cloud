import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @auther zheng jianghai
 * @create 2021-07-07 13:41
 */
public class test {

    @Test
    public void test1(){
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(date);
        System.out.println(s);
    }
}
