package com.example.calculatrice_mvc;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

public class MainActivity extends Activity {
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
	try {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.activity_main);

	   final MyModel myModel = new MyModel();
	   final MyView myView = new MyView(this);

	   MyController myController =
                     new MyController(this, myModel, myView);
ViewGroup container = 
   (ViewGroup) findViewById(R.id.myLayout);
container.addView(myView);
container.addView(myController); 
	}
	catch (Exception e) {
	   Log.e("ERROR", "ERROR IN CODE: " + e.toString());
	   e.printStackTrace();
	}
   }
}