package com.example.coffeeapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategory extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listDrinks = getListView();

        ArrayAdapter<drinks> listAdapter = new ArrayAdapter<drinks>(this,android.R.layout.simple_list_item_1,drinks.drink);
        listDrinks.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView,View view,int i,long l){
        Intent intent = new Intent(DrinkCategory.this,DrinkActivity.class);
        //intent.putExtra(DrinkActivity.EXTRA_DRINKNO,l);
        startActivity(intent);
    }
}
