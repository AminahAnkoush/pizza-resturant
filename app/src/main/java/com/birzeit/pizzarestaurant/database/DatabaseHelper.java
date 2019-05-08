package com.birzeit.pizzarestaurant.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //database name
    private static final String DATABASE_NAME = "pizza_restaurant";

    //database version
    private static final int DATABASE_VERSION = 1;

    // Table Names
    private static final String TABLE_USER = "users";
    private static final String TABLE_ORDER = "orders";
    private static final String TABLE_USER_ORDER = "user_orders";
    private static final String TABLE_FAVOURITE = "favorites";


    // User Table - column names
    private static final String KEY_ID = "id";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_FIRST_NAME = "first_name";
    private static final String KEY_LAST_NAME = "last_name";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_GENDER = "gender";
    private static final String KEY_IS_ADMIN = "is_admin";

    //create User Table
    private static final String CREATE_USER_TABLE =
            "CREATE TABLE " + TABLE_USER + "("
                    + KEY_EMAIL + " TEXT PRIMARY KEY,"
                    + KEY_PHONE + " TEXT, "
                    + KEY_FIRST_NAME + " TEXT, "
                    + KEY_LAST_NAME + " TEXT, "
                    + KEY_PASSWORD + " TEXT, "
                    + KEY_GENDER + " TEXT, "
                    + KEY_IS_ADMIN + " TEXT" + ")";


    // Order Table - column names
    private static final String KEY_ORDER_ID = "id";
    private static final String KEY_DATETIME = "time_stamp";
    private static final String KEY_TOTAL_PRICE = "total_price";

    //create Order table
    private static final String CREATE_ORDER_TABLE =
            "CREATE TABLE " + TABLE_ORDER + "("
                    + KEY_ORDER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + KEY_DATETIME + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                    + KEY_TOTAL_PRICE + " DECIMAL )";

    // Order-User Table - column names
    private static final String KEY_PIZZA_NAME = "pizza_name";
    private static final String KEY_SIZE = "size";
    private static final String KEY_PRICE = "price";

    //create Order-User Table
    private static final String CREATE_USER_ORDER_TABLE =
            "CREATE TABLE " + TABLE_USER_ORDER + "("
                    + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + KEY_ORDER_ID + " INTEGER,"
                    + KEY_EMAIL + " TEXT,"
                    + KEY_PIZZA_NAME + " TEXT,"
                    + KEY_SIZE + " TEXT,"
                    + KEY_PRICE + " DECIMAL )";


    //create Favorite table
    private static final String CREATE_FAVORITE_TABLE =
            "CREATE TABLE " + TABLE_FAVOURITE + "("
                    + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + KEY_EMAIL + " TEXT,"
                    + KEY_PIZZA_NAME + " TEXT )";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_USER_TABLE);
            db.execSQL(CREATE_ORDER_TABLE);
            db.execSQL(CREATE_FAVORITE_TABLE);
            db.execSQL(CREATE_USER_ORDER_TABLE);

        } catch (Exception e) {
            System.out.println(" Error create database " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_ORDER);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER_ORDER);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVOURITE);
        }
    }

}
