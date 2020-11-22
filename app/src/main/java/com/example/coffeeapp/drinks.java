package com.example.coffeeapp;

public class drinks {
    private String name;
    private String desc;
    private int imageID;

    private drinks(String name,String desc,int imageID){
        this.name = name;
        this.desc = desc;
        this.imageID = imageID;
    }

    public static final drinks [] drink = {
            new drinks("Latte","This is for Latte",R.drawable.latte),
            new drinks("Cappuccino","This is for Cappuccino",R.drawable.cup),
            new drinks("Filter","This is for Filter",R.drawable.beans)
    };

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public int getImageID(){
        return imageID;
    }

    public String toString(){
        return this.name;
    }

}
