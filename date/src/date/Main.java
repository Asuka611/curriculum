package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {

        String dateTime = "2018/01/01 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date = sdf.parse(dateTime);

        System.out.println(date);
    }
}