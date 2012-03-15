package com.app.src;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class SplashScreen extends Activity {
    /** Called when the activity is first created. */
	
	protected boolean _active = true;
	protected int _splashTime = 5000; 
    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }*/
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	 super.onCreate(savedInstanceState);  
    	this.setContentView(R.layout.splash);
    	  
    	// thread for displaying the SplashScreen
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while(_active && (waited < _splashTime)) {
                        sleep(100);
                        if(_active) {
                            waited += 100;
                        }
                    }
                } catch(InterruptedException e) {
                    // do nothing
                } finally {
                	Log.d("SRI","Error in Finally");
                	 
                    finish();
                	Intent explicitIntent = new Intent(SplashScreen.this,MenuScreen.class);
                    startActivity(explicitIntent);
                    stop();
                }
            }
        };
        splashTread.start();
       }
}