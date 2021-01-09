package com.offcn.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    //实现字符串转日期
    //方法的形参对应的实参就是页面送来的日期字符串
    @Override
    public Date convert(String s) {
        try {
            //参数指定的是页面传来的字符串格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
