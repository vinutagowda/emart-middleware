package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Category;
import com.cts.emart.model.SubCategory;
import com.cts.emart.service.SubCategoryService;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {

	@Autowired
	private SubCategoryService service;
	
	@RequestMapping("/all")
	List<SubCategory> getAll(){
		return service.getAllSubCategories();
	}
	
	@RequestMapping("/{subCategoryId}")
	Optional<SubCategory> getById(@PathVariable Long subCategoryId){
		return service.getSubCategoryById(subCategoryId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/{categoryId}")
	void addSubCategory(@RequestBody SubCategory subCategory, @PathVariable Long categoryId) {
		subCategory.setCategory(new Category(categoryId));
		service.addSubCategory(subCategory);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{subCategoryId}")
	void deleteCategoryById(@PathVariable Long subCategoryId) {
		service.deleteSubCategory(subCategoryId);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	void updateSubCategory(@RequestBody SubCategory subCategory) {
		service.updateSubCategory(subCategory);
		
	}
}
