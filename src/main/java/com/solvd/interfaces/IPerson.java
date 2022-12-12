package com.solvd.interfaces;

public interface IPerson extends ISpeak, IThink {
    String firstName ="",lastName ="",sex ="";
    int age = 0;

    void displayPersonInfo(String firstName,String lastName,String sex,int age);
}

