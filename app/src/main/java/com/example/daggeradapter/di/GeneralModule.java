package com.example.daggeradapter.di;

import android.content.Context;

import com.example.daggeradapter.Adapter;

import dagger.Module;
import dagger.Provides;

@Module
public class GeneralModule {

    private Context context;

    public GeneralModule(Context context) {
        this.context = context;
    }


    @Provides
    public Adapter getAdapter(){
        return new Adapter();
    }
}
