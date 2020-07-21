package com.example.daggeradapter;

import android.app.Application;

import com.example.daggeradapter.di.DaggerGeneralComponent;
import com.example.daggeradapter.di.GeneralComponent;
import com.example.daggeradapter.di.GeneralModule;

public class App extends Application {
    GeneralComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerGeneralComponent.builder()
                .generalModule(new GeneralModule(getApplicationContext()))  // add
                .build();
    }

    public GeneralComponent getComponent() {
        return component;
    }
}
