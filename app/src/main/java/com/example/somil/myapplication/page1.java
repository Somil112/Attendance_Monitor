package com.example.somil.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Somil on 10/16/2017.
 */

public class page1 extends Activity {
    TextView name1;
    DatabaseHelper mydb;

    Button submit;
    EditText sub1,sub2,sub3,sub4,sub5,sub6;
    public static String s1,s2,s3,s4,s5,s6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        name1=(TextView)findViewById(R.id.name1);
        name1.append(MainActivity.namesave);
        submit=(Button)findViewById(R.id.Submit);
        sub1=(EditText)findViewById(R.id.Sub1);
        sub2=(EditText)findViewById(R.id.Sub2);
        sub3=(EditText)findViewById(R.id.Sub3);
        sub4=(EditText)findViewById(R.id.Sub4);
        sub5=(EditText)findViewById(R.id.Sub5);
        sub6=(EditText)findViewById(R.id.Sub6);

mydb=new DatabaseHelper(this);
        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        s1=sub1.getText().toString();
                        if(!s1.isEmpty())
                        {
mydb.insertsubData(s1);
                            if (mydb.insertsubData(s1)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        s2=sub2.getText().toString();
                        if(!s2.isEmpty())
                        {
                            mydb.insertsubData(s2);
                            if (mydb.insertsubData(s2)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        s3=sub3.getText().toString();
                        if(!s3.isEmpty())
                        {
                            mydb.insertsubData(s3);
                            if (mydb.insertsubData(s3)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        s4=sub4.getText().toString();
                        if(!s4.isEmpty())
                        {
                            mydb.insertsubData(s4);
                            if (mydb.insertsubData(s4)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        s5=sub5.getText().toString();
                        if(!s5.isEmpty())
                        {
                            mydb.insertsubData(s5);
                            if (mydb.insertsubData(s5)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        s6=sub6.getText().toString();
                        if(!s6.isEmpty())
                        {
                            mydb.insertsubData(s6);
                            if (mydb.insertsubData(s6)==true) {
                                Toast.makeText(page1.this, "Data inserted", Toast.LENGTH_LONG).show();
                            }
                        }
                        Intent pg2=new Intent(page1.this,page2.class);
                        startActivity(pg2);





                    }
                }
        );



    }
}
