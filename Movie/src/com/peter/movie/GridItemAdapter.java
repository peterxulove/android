package com.peter.movie;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;  
import java.util.List;  
import java.util.regex.Pattern;
  
import android.content.Context;  
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.BaseAdapter;  
import android.widget.ImageView;  
import android.widget.TextView;  
  
public class GridItemAdapter extends BaseAdapter  
{  
  
    private LayoutInflater inflater;   
    public   List<GridItem> gridItemList = new ArrayList();   
    
    public Context t;
    
   
   
    public GridItemAdapter (Context context)   
    {   
        super();   
       
       	DataSourceHelper.getNewData(gridItemList,"", "");
        
        inflater = LayoutInflater.from(context);   
        t = context;
        
    }   
    
    
    public void nextPage()
    {
    	gridItemList.clear();
    	  DataSourceHelper.getNewData(gridItemList,"", "");
    }
    
    @Override  
    public int getCount( )  
    {  
        if (null != gridItemList)   
        {   
            return gridItemList.size();   
        }   
        else  
        {   
            return 0;   
        }   
    }  
  
    @Override  
    public Object getItem( int position )  
    {  
        return gridItemList.get(position);   
    }  
  
    @Override  
    public long getItemId( int position )  
    {  
        return position;   
    }  
    
    
    public   boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();   
     } 
    
  
    @Override  
    public View getView( int position, View convertView, ViewGroup parent )  
    {  
        ViewHolder viewHolder;   
    
        if (convertView == null)   
        {   
            convertView = inflater.inflate(R.layout.grid_item, null);   
            viewHolder = new ViewHolder();   
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);   
            
            viewHolder.image = (ImageView) convertView.findViewById(R.id.image);  
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);   
            convertView.setTag(viewHolder);   
        } else  
        {   
            viewHolder = (ViewHolder) convertView.getTag();   
        }   
        
        viewHolder.title.setText(gridItemList.get(position).getTitle());  
        viewHolder.description.setText(gridItemList.get(position).getDescription());   
        viewHolder.image.setImageResource(R.drawable.demo);
        
      
        	
        //    AsynImageLoader asynImageLoader = new AsynImageLoader();  
        //    asynImageLoader.showImageAsyn(viewHolder.image, gridItemList.get(position).getImageId(), R.drawable.ic_launcher);  
            
       
        
     //   convertView.setTag(viewHolder);
       
        
        return convertView;   
    }
    
    
    
}