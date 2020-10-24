package com.example.igclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        // Register parse models
        ParseObject.registerSubclass(Post.class);
        //Initialize the parse SDK right after the app is created
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("g9wLyO8J7kAHqWEREYRK8kxU8EGdKP21ifchxTXR")
                .clientKey("BWTL5YC87G0MyMQqj4aHiXdOPIJ9g31KbarekSzE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
