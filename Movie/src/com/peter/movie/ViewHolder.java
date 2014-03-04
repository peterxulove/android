package com.peter.movie;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder   
{   
    public ImageView image;   
    public TextView title;  
    public TextView description;
    
    
	public ImageView getImage() {
		return image;
	}
	public void setImage(ImageView image) {
		this.image = image;
	}
	public TextView getTitle() {
		return title;
	}
	public void setTitle(TextView title) {
		this.title = title;
	}
	public TextView getDescription() {
		return description;
	}
	public void setDescription(TextView description) {
		this.description = description;
	}
	 
    
    
    
}   

