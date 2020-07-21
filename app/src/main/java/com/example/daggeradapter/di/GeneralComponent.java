package com.example.daggeradapter.di;

import com.example.daggeradapter.MainActivity;

import dagger.Component;

@Component(modules = GeneralModule.class)
public interface GeneralComponent {

    void  inject(MainActivity mainActivity);
}
