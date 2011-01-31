package im2.org.sample.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnNext = (Button) findViewById(R.id.btnNext);
    	btnNext.setOnClickListener(new OnClickListener() {			
    		public void onClick(View v) {
    			onClickNext();
    		}	    		
		});
    	
    	Button btnExit = (Button) findViewById(R.id.btnExit);
    	btnExit.setOnClickListener(new OnClickListener() {			
    		public void onClick(View v) {    			
    			finish();
    		}	    		
		});
        
    }
    	
    
    public void onClickNext() {
    	
    	Intent intent = new Intent().setClass(this, LoginActivity.class);
    	startActivity(intent);
    }
    
}