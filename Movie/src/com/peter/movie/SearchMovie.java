package com.peter.movie;

import android.view.View;
import android.view.View.OnClickListener;

public class SearchMovie implements OnClickListener {

	GridItemAdapter adapter;
	
	public  SearchMovie(GridItemAdapter adapter)
	{
		super();
		this.adapter = adapter;
		 
		
	}
	
	@Override
	public void onClick(View arg0) {
	 
			 adapter.nextPage();
			 adapter.notifyDataSetChanged();
			 
//			   LayoutInflater inflater = (LayoutInflater)   
//					   arg0.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
//			   GridView gridView=  (GridView) inflater.inflate(R.id.gridview,null);  
//			   
//				  this.adapter = (GridItemAdapter)    gridView.getAdapter();
//			   adapter.nextPage();
//				 adapter.notifyDataSetChanged();
//				 

	}

}
