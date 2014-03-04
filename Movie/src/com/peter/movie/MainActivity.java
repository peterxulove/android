package com.peter.movie;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity   {

	EditText selection = null;
	
	  public GridView gridView;   
	    
	    
	    /** Called when the activity is first created. */  
	    @Override  
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_main);  
	          
	        
	        
	        // 初始化控件
	        Spinner  category = (Spinner) findViewById(R.id.spinner_category);
	        	// 建立数据源
	        String[] mItems = getResources().getStringArray(R.array.MovieCategory);
	        	// 建立Adapter并且绑定数据源
	        ArrayAdapter<String> _Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mItems);
	        	//绑定 Adapter到控件
	        category.setAdapter(_Adapter);
	        
	        
	        
	        gridView = (GridView) findViewById(R.id.gridview);   
	        selection = (EditText) findViewById(R.id.search);
	        Button dosearch = (Button)findViewById(R.id.dosearch);
	        
	        GridItemAdapter adapter = new GridItemAdapter(this);   
	        gridView.setAdapter(adapter);   
	   
	        gridView.setOnItemClickListener(new OnItemClickListener()   
	            {   
	                @Override  
	                public void onItemClick(AdapterView<?> parent, View v, int position, long id)   
	                {   
	                	GridItem gi = (GridItem) gridView.getAdapter().getItem(position);
	                	
	                    new AlertDialog.Builder(MainActivity.this)  
	                    .setTitle("选择片源")  
	                    .setItems(   (String[]) gi.getSources().keySet().toArray( new String[0]), null)
	                    .setNegativeButton("取消", null)  
	                    .show();   
	                    
	                }  
	            });   
	        
	        dosearch.setOnClickListener(new SearchMovie(adapter));
	      
	    }  
	       
	 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	
}
