package com.example.simplelayout;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	   /** Called when the activity is first created. */  
    Button btnShow;  
    Button btnClear;  
    Button goOther;
    EditText edtInput;  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
        btnShow=(Button)findViewById(R.id.btnShow);//控件与代码绑定  
        btnClear=(Button)findViewById(R.id.btnClear);//控件与代码绑定  
        goOther = (Button)findViewById(R.id.buttongo);
        
        edtInput=(EditText)findViewById(R.id.edtInput);//控件与代码绑定  
        btnShow.setOnClickListener(new ClickListener());//使用点击事件  
        btnClear.setOnClickListener(new ClickListener());//使用点击事件  
        goOther.setOnClickListener(new ClickListener());
        
        
    }  
      
      
    class  ClickListener implements OnClickListener  
    {  
        public void onClick(View v)  
        {  
            if(v==btnShow)  
            {  
                new AlertDialog.Builder(MainActivity.this)  
                .setIcon(android.R.drawable.ic_dialog_alert)  
                .setTitle("Information")  
                .setMessage(edtInput.getText())  
                .show();          
            }  
            else if(v==btnClear)  
            {  
                edtInput.setText("HelloAndroid");  
            }else if (v==goOther)
            {
            	Intent intent = new Intent(MainActivity.this, SecondActivity.class);
          
            	
            	intent.putExtra("test", " Hah haha ");
            	
                startActivity(intent);

            }
        }  
    }  

}
