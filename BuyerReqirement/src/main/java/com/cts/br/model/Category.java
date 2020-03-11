package com.cts.br.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
	

    @Id
	private String CategoryName;
	private int CatrgoryId;
	private double Gst;
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public int getCatrgoryId() {
		return CatrgoryId;
	}
	public void setCatrgoryId(int catrgoryId) {
		CatrgoryId = catrgoryId;
	}
	public double getGst() {
		return Gst;
	}
	public void setGst(double gst) {
		Gst = gst;
	}
	
	
}
