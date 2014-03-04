package com.peter.movie;

import java.util.ArrayList;
import java.util.Map;

public  class GridItem   
{   
    private String title;   
    private String imageId;   
    private String description;  
    private Map<String, String> sources;
    
      
    public GridItem()   
    {   
        super();   
    }   
   
    public GridItem(String title, String imageId,String time)   
    {   
        super();   
        this.title = title;   
        this.imageId = imageId;   
        this.description = time;  
    }   
   
    public GridItem(String title, String imageId,String time,Map<String,String> sources)   
    {   
        super();   
        this.title = title;   
        this.imageId = imageId;   
        this.description = time;  
        this.sources =  sources;
    }
    
    

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<String, String> getSources() {
		return sources;
	}

	public void setSources(Map<String, String> sources) {
		this.sources = sources;
	}
    
    
    
    
    
    
    
}   

