package com.example.somil.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.somil.myapplication.page1.s1;
import static com.example.somil.myapplication.page1.s2;
import static com.example.somil.myapplication.page1.s3;
import static com.example.somil.myapplication.page1.s4;
import static com.example.somil.myapplication.page1.s5;
import static com.example.somil.myapplication.page1.s6;


/**
 * Created by Somil on 10/17/2017.
 */

public class page2 extends Activity {
    TextView result;
    DatabaseHelper mydb;
    TextView tv1, tv2, tv3, tv4, tv5, tv6,counterattend1,counterattend2,counterattend3,counterattend4,counterattend5,counterattend6,counterbunk1,counterbunk2,counterbunk3,counterbunk4,counterbunk5,counterbunk6;
    Button a1, b1, a2, b2, a3, b3, a4, b4, a5, b5, a6, b6;
    public static int sub1total=0,sub2total=0,sub3total=0,sub4total=0,sub5total=0,sub6total=0;
   public static int sub1_attend=0,sub1_bunk=0,sub2_attend=0,sub2_bunk=0,sub3_attend=0,sub3_bunk=0,sub4_attend=0,sub4_bunk=0,sub5_attend=0,sub5_bunk=0,sub6_attend=0,sub6_bunk=0;
RelativeLayout rsub1,rsub2,rsub3,rsub4,rsub5,rsub6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        counterattend1=(TextView)findViewById(R.id.counterattend1);
        counterattend2=(TextView)findViewById(R.id.counterattend2);
        counterattend3=(TextView)findViewById(R.id.counterattend3);
        counterattend4=(TextView)findViewById(R.id.counterattend4);
        counterattend5=(TextView)findViewById(R.id.counterattend5);
        counterattend6=(TextView)findViewById(R.id.counterattend6);
        counterbunk1=(TextView)findViewById(R.id.counterbunk1);
        counterbunk2=(TextView)findViewById(R.id.counterbunk2);
        counterbunk3=(TextView)findViewById(R.id.counterbunk3);
        counterbunk4=(TextView)findViewById(R.id.counterbunk4);
        counterbunk5=(TextView)findViewById(R.id.counterbunk5);
        counterbunk6=(TextView)findViewById(R.id.counterbunk6);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
        a6 = (Button) findViewById(R.id.a6);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        a2.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);
        rsub1=(RelativeLayout)findViewById(R.id.subject1);
        rsub2=(RelativeLayout)findViewById(R.id.subject2);
        rsub3=(RelativeLayout)findViewById(R.id.subject3);
        rsub4=(RelativeLayout)findViewById(R.id.subject4);
        rsub5=(RelativeLayout)findViewById(R.id.subject5);
        rsub6=(RelativeLayout)findViewById(R.id.subject6);
        rsub1.setVisibility(View.GONE);
        rsub2.setVisibility(View.GONE);
        rsub3.setVisibility(View.GONE);
        rsub4.setVisibility(View.GONE);
        rsub5.setVisibility(View.GONE);
        rsub6.setVisibility(View.GONE);
        mydb=new DatabaseHelper(this);



        if (!s1.isEmpty()) {
            tv1.setText(s1);
            if (tv1.length() > 0) {
                rsub1.setVisibility(View.VISIBLE);
                a1.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);

            }
        }
        if (!s2.isEmpty()) {
            tv2.setText(s2);
            if (tv2.length() > 0) {
                rsub2.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);


            }
        }
        if (!s3.isEmpty()) {
            tv3.setText(s3);
            if (tv3.length() > 0) {
                rsub3.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);

            }
        }
        if (!s4.isEmpty()) {
            tv4.setText(s4);
            if (tv4.length() > 0) {
                rsub4.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);

            }
        }
        if (!s5.isEmpty()) {
            tv5.setText(s5);
            if (tv5.length() > 0) {
                rsub5.setVisibility(View.VISIBLE);
                a5.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);

            }
        }
        if (!s6.isEmpty()) {
            tv6.setText(s6);
            if (tv6.length() > 0) {
                rsub6.setVisibility(View.VISIBLE);
                a6.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);

            }
        }
        a1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub1_attend++;
                        counterattend1.setText(toString().valueOf(sub1_attend));





                    }
                }
        );
        a2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub2_attend++;
                        counterattend2.setText(toString().valueOf(sub2_attend));
                    }
                }
        );
        a3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub3_attend++;
                        counterattend3.setText(toString().valueOf(sub3_attend));
                    }
                }
        );
        a4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub4_attend++;
                        counterattend4.setText(toString().valueOf(sub4_attend));
                    }
                }
        );
        a5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub5_attend++;
                        counterattend5.setText(toString().valueOf(sub5_attend));
                    }
                }
        );
        a6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub6_attend++;
                        counterattend6.setText(toString().valueOf(sub6_attend));
                    }
                }
        );
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub1_bunk++;
                        counterbunk1.setText(toString().valueOf(sub1_bunk));
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub2_bunk++;
                        counterbunk2.setText(toString().valueOf(sub2_bunk));
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub3_bunk++;
                        counterbunk3.setText(toString().valueOf(sub3_bunk));
                    }
                }
        );
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub4_bunk++;
                        counterbunk4.setText(toString().valueOf(sub4_bunk));
                    }
                }
        );
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub5_bunk++;
                        counterbunk5.setText(toString().valueOf(sub5_bunk));

                    }
                }
        );
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sub6_bunk++;
                        counterbunk6.setText(toString().valueOf(sub6_bunk));

                    }
                }
        );




        Button next2=(Button)findViewById(R.id.next2);
        next2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!s1.isEmpty())
                    {
                        mydb.insertattData(sub1_attend);
                     /*   if (mydb.insertattData(sub1_attend)==true) {
                        *//*    Toast.makeText(page2.this, "Data inserted", Toast.LENGTH_LONG).show();*//*
                        }*/
                    }

                        if(!s2.isEmpty()) {
                            mydb.insertattData(sub2_attend);
                     /*       if (mydb.insertattData(sub2_attend)==true) {
                                Toast.makeText(page2.this, "Data inserted", Toast.LENGTH_LONG).show();
                        }
                        }*/
                        }
                        if(!s3.isEmpty())
                        {
                            mydb.insertattData(sub3_attend);
                      /*      if (mydb.insertattData(sub3_attend)==true) {
                              *//*  Toast.makeText(page2.this, "Data inserted", Toast.LENGTH_LONG).show();*//*
                            }*/
                        }

                        if(!s4.isEmpty())
                        {
                            mydb.insertattData(sub4_attend);
                          /*  if (mydb.insertattData(sub4_attend)==true) {

                            }*/
                        }

                        if(!s5.isEmpty())
                        {
                            mydb.insertattData(sub5_attend);
                         /*   if (mydb.insertattData(sub5_attend)==true) {
                        *//*        Toast.makeText(page2.this, "Data inserted", Toast.LENGTH_LONG).show();*//*
                            }*/
                        }

                        if(!s6.isEmpty())
                        {
                            mydb.insertattData(sub6_attend);
                     /*       if (mydb.insertattData(sub6_attend)==true) {
                               *//* Toast.makeText(page2.this, "Data inserted", Toast.LENGTH_LONG).show();*//*
                            }*/
                        }
                        sub1total=sub1_attend+sub1_bunk;
                        sub2total=sub2_attend+sub2_bunk;
                        sub3total=sub3_attend+sub3_bunk;
                        sub4total=sub4_attend+sub4_bunk;
                        sub5total=sub5_attend+sub5_bunk;
                        sub6total=sub6_attend+sub6_bunk;
                        Intent pg3= new Intent(page2.this,page3.class);
                        startActivity(pg3);
                    }
                }
        );
    }

}
