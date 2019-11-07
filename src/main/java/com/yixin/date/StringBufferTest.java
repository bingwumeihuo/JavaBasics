package com.yixin.date;

import org.junit.Test;

/**
 * @Package: com.yixin.date
 * @ClassName: StringBufferTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/5 16:50
 */
public class StringBufferTest {
    @Test
    public void testStringBuffer() {
        String s = null;
        StringBuffer s1 = new StringBuffer();
        s1.append(s);
        System.out.println(s1.length());
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer(s);
        System.out.println(s2);

    }
}
