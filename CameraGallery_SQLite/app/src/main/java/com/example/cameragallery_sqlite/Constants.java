package com.example.cameragallery_sqlite;

public class Constants {

    //DB Name
    public static final String DB_NAME = "My_RECORDS_DB";
    //DB Version
    public static final String DB_VERSION = "1";
    //table name
    public static final String TABLE_NAME = "My_RECORDS_TABLE";
    //column
    public static final String C_ID = "ID";
    public static final String C_NAME = "NAME";
    public static final String C_IMAGE = "IMAGE";
    public static final String C_BIO = "BIO";
    public static final String C_PHONE = "PHONE";
    public static final String C_EMAIL = "EMAIL";
    public static final String C_DOB = "DOB";
    public static final String C_ADDED_TIMESTAMP= "ADDED_TIME_STAMP";
    public static final String C_UPDATED_TIMESTAMP = "UPDATED_TIME_STAMP";

    //table query
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_NAME + " TEXT,"
            + C_IMAGE + " TEXT,"
            + C_BIO + " TEXT,"
            + C_PHONE + " TEXT,"
            + C_EMAIL + " TEXT,"
            + C_DOB + " TEXT,"
            + C_ADDED_TIMESTAMP + " TEXT,"
            + C_UPDATED_TIMESTAMP + " TEXT,"
            + ")";


}
