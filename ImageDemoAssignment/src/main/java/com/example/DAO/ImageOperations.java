package com.example.DAO;

import com.example.model.Image;

public interface ImageOperations
{

	public void addImage(Image obj);
	public void displayImage(int i);
	public void updateImageName(int i,String name);
	public void deleteImage(int i);
	
}
