package com.company.rpg_exercise;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Log {
    static void log(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

    }


}
