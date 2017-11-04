package com.example.somil.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import static com.example.somil.myapplication.page2.sub1_attend;
import static com.example.somil.myapplication.page2.sub1_bunk;
import static com.example.somil.myapplication.page2.sub1total;
import static com.example.somil.myapplication.page2.sub2_attend;
import static com.example.somil.myapplication.page2.sub2_bunk;
import static com.example.somil.myapplication.page2.sub2total;
import static com.example.somil.myapplication.page2.sub3_attend;
import static com.example.somil.myapplication.page2.sub3_bunk;
import static com.example.somil.myapplication.page2.sub3total;
import static com.example.somil.myapplication.page2.sub4_attend;
import static com.example.somil.myapplication.page2.sub4_bunk;
import static com.example.somil.myapplication.page2.sub4total;
import static com.example.somil.myapplication.page2.sub5_attend;
import static com.example.somil.myapplication.page2.sub5_bunk;
import static com.example.somil.myapplication.page2.sub5total;
import static com.example.somil.myapplication.page2.sub6_attend;
import static com.example.somil.myapplication.page2.sub6_bunk;
import static com.example.somil.myapplication.page2.sub6total;

/**
 * Created by Somil on 10/17/2017.
 */

public class page3 extends Activity {
   public static float ps1,ps2,ps3,ps4,ps5,ps6;
    TextView as1,as2,as3,as4,as5,as6;
    int totalattend=0,total=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        as1=(TextView)findViewById(R.id.attendacesub1);
        as2=(TextView)findViewById(R.id.attendacesub2);
        as3=(TextView)findViewById(R.id.attendacesub3);
        as4=(TextView)findViewById(R.id.attendacesub4);
        as5=(TextView)findViewById(R.id.attendacesub5);
        as6=(TextView)findViewById(R.id.attendacesub6);
        as1.setVisibility(View.GONE);
        as2.setVisibility(View.GONE);
        as3.setVisibility(View.GONE);
        as4.setVisibility(View.GONE);
        as5.setVisibility(View.GONE);
        as6.setVisibility(View.GONE);
        if(sub1_attend!=0||sub1_bunk!=0) {
            ps1 =(float) ((sub1_attend*1.0)/sub1total)*100;
totalattend+=sub1_attend;
            total+=sub1_attend+sub1_bunk;
            as1.setVisibility(View.VISIBLE);
            as1.append(" "+page1.s1+" is "+String.valueOf(ps1)+"%");
            if(ps1>75.0)
            {
                as1.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as1.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        if(sub2_attend!=0||sub2_bunk!=0) {
            totalattend+=sub2_attend;
            total+=sub2_attend+sub2_bunk;
            ps2 =(float) ((sub2_attend*1.0)/sub2total)*100;
            as2.setVisibility(View.VISIBLE);
            as2.append(" "+page1.s2+" is "+String.valueOf(ps2)+"%");
            if(ps2>75.0)
            {
                as2.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as2.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        if(sub3_attend!=0||sub3_bunk!=0) {
            totalattend+=sub3_attend;
            total+=sub3_attend+sub3_bunk;
            ps3 =(float) ((sub3_attend*1.0)/sub3total)*100;
            as3.setVisibility(View.VISIBLE);
            as3.append(" "+page1.s3+" is "+String.valueOf(ps3)+"%");
            if(ps3>75.0)
            {
                as3.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as3.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        if(sub4_attend!=0||sub4_bunk!=0) {
            totalattend+=sub4_attend;
            total+=sub4_attend+sub4_bunk;
            ps4 =(float) ((sub4_attend*1.0)/sub4total)*100;
            as4.setVisibility(View.VISIBLE);
            as4.append(" "+page1.s4+" is "+String.valueOf(ps4)+"%");
            if(ps4>75.0)
            {
                as4.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as4.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        if(sub5_attend!=0||sub5_bunk!=0) {
            totalattend+=sub5_attend;
            total+=sub5_attend+sub5_bunk;
            ps5 =(float) ((sub5_attend*1.0)/sub5total)*100;
            as5.setVisibility(View.VISIBLE);
            as5.append(" "+page1.s5+" is "+String.valueOf(ps5)+"%");
            if(ps5>75.0)
            {
                as5.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as5.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        if(sub6_attend!=0||sub6_bunk!=0) {
            totalattend+=sub6_attend;
            total+=sub6_attend+sub6_bunk;
            ps6 = (float)((sub6_attend*1.0)/sub6total)*100;

            as6.setVisibility(View.VISIBLE);
            as6.append(" "+page1.s6+" is "+String.valueOf(ps6)+"%");
            if(ps6>75.0)
            {
                as6.setBackgroundColor(getResources().getColor(R.color.blue));
            }
            else
            {
                as6.setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
TextView totalattendance=(TextView)findViewById(R.id.totaltpercent);
        totalattendance.append(String.valueOf((float)((totalattend*1.0)/total)*100));








    }
}
