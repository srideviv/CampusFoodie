package com.app.src;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MenuScreen  extends Activity {
	private Button searchButton;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.searchButton = (Button)this.findViewById(R.id.search);
  	  this.searchButton.setOnClickListener(new OnClickListener() {
  	    public void onClick(View v) {
  	      //finish();
  	    }
  	  });
  	}

}
