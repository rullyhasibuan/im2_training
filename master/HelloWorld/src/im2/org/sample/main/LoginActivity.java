package im2.org.sample.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    
		
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        
        final EditText txtUser = (EditText) findViewById(R.id.txtUser);
    	final EditText txtPass = (EditText) findViewById(R.id.txtPass);
    	
    	
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
    	btnLogin.setOnClickListener(new OnClickListener() {			
    		public void onClick(View v) {
    			doLogin(txtUser.getText().toString(), txtPass.getText().toString());
    		}	    		
		});
    	
    	Button btnCancel = (Button) findViewById(R.id.btnCancel);
    	btnCancel.setOnClickListener(new OnClickListener() {			
    		public void onClick(View v) {
    			finish();
    		}	    		
		});
    	
        
    }
    
    public void doLogin(String user, String pass) {
    	String showText = "Username: "+user + ", Password: "+pass;
    	Toast.makeText(this, showText, Toast.LENGTH_LONG).show();
    }
    
    
    
    
    
    
    
    
    
    
    /*
    public void onDeclare() {
    	
    	btnLogin  = (Button) findViewById(R.id.btnLogin);
    	btnCancel = (Button) findViewById(R.id.btnCancel);
    	
    	txtUser   = (TextView) findViewById(R.id.txtUser);
    	txtPass   = (TextView) findViewById(R.id.txtPass);
    	
    }
    
    public void onManipulateWidget() {
    	
    	
    	btnLogin.setOnClickListener(new OnClickListener() {
			
    		public void onClick(View v) {	    			
    			DisplayToast("Your username is: "+txtUser.getText().toString()+
    					"\nYour password is: "+txtPass.getText().toString());    			
			}	    		
		});
    	
    	btnCancel.setOnClickListener(new OnClickListener() {
			
    		public void onClick(View v) {	    			
    			finish();
    			return;
			}	    		
		});
    }
    */
    
    public void onLoadStarting() {}
    
    public void DisplayToast(String txt) {
		Toast.makeText(this, txt.trim(), Toast.LENGTH_LONG).show();
	}
    
}