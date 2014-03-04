package com.peter.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import android.util.Log;

public class DataSourceHelper {
	
	public static List<GridItem> getNewData(List data, String name, String category)
	{
		if(data==null)
		{
			 data = new ArrayList();
		}else
		{
			data.clear();
		}
		
		
		
		for(int i=0; i<10; i++)
		{
			
			//int rdi =  random1.nextInt();
			
			String rdi = String.valueOf((int)(Math.random() * 10+i)) ;
			
			//rdi =  (int) (System.currentTimeMillis()/rdi);
			
			Log.i("system time :",""+System.currentTimeMillis());
			
			
			Log.i("datasource",""+rdi);
			GridItem item = new GridItem();
			item.setImageId(""+R.drawable.demo);
			item.setTitle("80's(80后)" +"之"+rdi);
			item.setDescription("80's(80后)是不一部不错的电影。。。。^_^" +"之"+rdi);
			Map sources  = new HashMap();
			sources.put("中国功夫HD1080P", "http://www.test.com/中国功夫HD1080P.mp4");
			sources.put("李小龙传奇720P", "http://www.test.com/李小龙传奇720P.mp4");
			sources.put("无人区1080P", "http://www.test.com/无人区1080P.mp4");
			
			item.setSources(sources);
			
			data.add(item);
			
		}
		
		return data;
	}
	
	
	

}
