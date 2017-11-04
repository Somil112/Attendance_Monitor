package com.example.somil.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="attendancestore.db";
    public static final String TABLE_NAME="attendancestore_table";
    public static final String ID="ID";
    public static final String SUBJECT="SUBJECT";
    public static final String ATTENDED="ATTENDED";
    public static final String BUNKED="BUNKED";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }
    /*"create table"+TABLE_NAME+"( "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+SUBJECT+" VARCHAR, "+ATTENDED+" INTEGER, "+BUNKED+" INTEGER"+")"*/
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " +TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+SUBJECT+" TEXT, "+ATTENDED+" INTEGER, "+BUNKED+" INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME );
        onCreate(sqLiteDatabase);

    }
    public boolean insertData(String subject,String attended,String bunked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(SUBJECT,subject);
        contentValues.put(BUNKED,bunked);
        contentValues.put(ATTENDED,attended);
      long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public boolean insertsubData(String subject){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(SUBJECT,subject);

        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public boolean insertattData(int attend){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ATTENDED,attend);

        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public boolean insertbnkData(int bunk){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(BUNKED,bunk);

        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public Cursor getData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }
}