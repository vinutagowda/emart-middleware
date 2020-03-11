package com.cts.emart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subCategoryId;
	private String subCategoryName;
	private String description;
	@ManyToOne
	private Category category;

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubCategory(Long subCategoryId) {
		super();
		this.subCategoryId = subCategoryId;
	}

	public SubCategory() {
		super();
	}
}
