package com.example.somil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button nextbutton;
    EditText Username;
   public static String namesave;

TextView Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbutton=(Button)findViewById(R.id.next);
        Username=(EditText)findViewById(R.id.Name);

    /*    Name=(TextView)findViewById(R.id.is);
        Name.setVisibility(View.GONE);*/
nextbutton.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namesave=Username.getText().toString();
                Toast.makeText(getApplicationContext(),"Welcome "+ namesave,Toast.LENGTH_SHORT).show();
         /*       Name.append(namesave);*/

                Intent pg1=new Intent(MainActivity.this,page1.class);

                startActivity(pg1);

            }
        }
);

    }
}
