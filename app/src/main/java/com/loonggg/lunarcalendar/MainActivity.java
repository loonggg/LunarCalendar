package com.loonggg.lunarcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.loonggg.lunarlib.LunarCalendar;

public class MainActivity extends AppCompatActivity {
    private TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取农历
        Log.i("农历", LunarCalendar.getLunarYearMonthDay(2017, 5, 27));
        //只获取农历的年份
        Log.i("农历", LunarCalendar.getLunarYear(2017, 5, 27, true));
        Log.i("农历", LunarCalendar.getLunarYear(2017, 5, 27, false));
        //只获取农历的月日
        Log.i("农历", LunarCalendar.getLunarMonthDay(2017, 5, 27));
        //只获取农历的生肖
        Log.i("农历", LunarCalendar.getLunarAnimal(2017, 5, 27));
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv1.setText(LunarCalendar.getLunarYearMonthDay(2017, 5, 27));
        tv2.setText(LunarCalendar.getLunarYear(2017, 5, 27, true));
        tv3.setText(LunarCalendar.getLunarYear(2017, 5, 27, false));
        tv4.setText(LunarCalendar.getLunarMonthDay(2017, 5, 27));
        tv5.setText(LunarCalendar.getLunarAnimal(2017, 5, 27));
    }
}
