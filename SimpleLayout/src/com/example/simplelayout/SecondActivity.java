package com.example.simplelayout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends Activity {

	  private static final int Item_Start = Menu.FIRST;  
	    private static final int Item_Exit = Menu.FIRST+1;  
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	 
				
		 Intent intent = getIntent();  
	    String message = intent.getStringExtra("test");
//
//	    // Create the text view
//	    TextView textView = new TextView(this);
//	    textView.setTextSize(40);
//	    textView.setText(message);

	     
	    
		
		  	TextView hello = (TextView) findViewById(R.id.helloword);
    	
           hello.setText(message);
           
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	
		
		 menu.add(0, Item_Start, 0, "开始");  
	        menu.add(0, Item_Exit, 0, "退出");  
	        return true;  
		
 
	}
	
	  @Override  
	    public boolean onOptionsItemSelected(MenuItem item) {  
	        switch(item.getItemId()){  
	            //菜单项1被选择  
	            case Item_Start:  
	                //这只Activity标题  
	                setTitle("开始游戏");  
	                break;  
	            //菜单项1被选择  
	            case Item_Exit:  
	                setTitle("退出！");  
	                break;  
	        }  
	        return true;  
	    }  

}
