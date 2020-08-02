package com.tds.data.sg.javaecommsg.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "sg-products-ecomm")
public class Product {

	@Id
    private int id;
    private String company;
    private String description;
    private boolean featured;
    private String image;
    private String price;
    private String sid;
    private String title;
    
 
    public Product() { }


	
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isFeatured() {
		return featured;
	}


	public void setFeatured(boolean featured) {
		this.featured = featured;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
 
   
	
	

}
