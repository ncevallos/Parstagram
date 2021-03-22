package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("EVYz3kXCrKVt4IuQKNbbBVHBj0JbGZbOVlONNfxK")
                .clientKey("57v3Fxjg0DDr1WU3r3WNiAMZV07248sykZOby1sF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
