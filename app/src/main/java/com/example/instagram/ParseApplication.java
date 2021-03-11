package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jjQ9R8SJod8bBDNcIftre5im2HVsj6gn6zNIRIZ0")
                .clientKey("TSAvw0JJOWzcZdJ3CGKF5csVOrzwaIra8xoyWVwu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
