package com.example.Service;

import com.example.model.Image;

public interface ImageServiceInt 
{

	public void addImageSer(Image obj);
	public void displayImageSer(int i);
	public void updateImageNameSer(int i,String name);
	public void deleteImageSer(int i);
	
}
