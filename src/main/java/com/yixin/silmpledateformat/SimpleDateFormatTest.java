package com.yixin.silmpledateformat;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Package: com.yixin.silmpledateformat
 * @ClassName: SlimpleDateFormat
 * @Description: SlimpleDateFormat类作用
 * @Author: 式神
 * @CreateDate: 2019/11/6 14:52
 */
public class SimpleDateFormatTest {
    @Test
    public void date() throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat();
        Date d1 = new Date();
        System.out.println(s1.format(d1));
        String str = "2019/11/6 下午3:00";
        Date s3 = s1.parse(str);
        System.out.println(s3);
        System.out.println("*************************");
        SimpleDateFormat s12 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        System.out.println(s12.format(d1));
        String sq1 = "2020-09-08";

    }
    @Test
    public void test(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        System.out.println(instance.getClass());
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
    }
}
