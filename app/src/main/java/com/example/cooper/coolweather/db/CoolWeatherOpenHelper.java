package com.example.cooper.coolweather.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cooper on 2016/10/17.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * 省份表建立的语句
     */

    public static final String CREATE_PROVINCE = "create table Province("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";

    /**
     * 城市表建立的语句
     */
    public static final String CREATE_CITY = "create table City("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"city_id integer)";

    /**
     * 乡镇表建立的语句
     */
    public static final String CREATE_COUNTY = "create table Couty("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"county_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int version){
        super(context,name,cursorFactory,version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
