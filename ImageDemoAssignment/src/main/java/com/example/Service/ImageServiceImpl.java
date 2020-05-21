package com.example.Service;

import com.example.DAO.ImageOperationImpl;
import com.example.DAO.ImageOperations;
import com.example.model.Image;

public class ImageServiceImpl implements ImageServiceInt {

	private ImageOperations objOperations=null;
	{
		objOperations=new ImageOperationImpl();
	}
	public void addImageSer(Image obj) {
		// TODO Auto-generated method stub

		objOperations.addImage(obj);
	}

	public void displayImageSer(int i) {
		// TODO Auto-generated method stub
		objOperations.displayImage(i);

	}

	public void updateImageNameSer(int i, String name) {
		// TODO Auto-generated method stub

		objOperations.updateImageName(i, name);
	}

	public void deleteImageSer(int i) {
		// TODO Auto-generated method stub

		objOperations.deleteImage(i);
	}

}
