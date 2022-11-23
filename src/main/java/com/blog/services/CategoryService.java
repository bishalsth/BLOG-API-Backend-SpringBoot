package com.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.payloads.CategoryDto;


public interface CategoryService  {
	
//	create
	CategoryDto createCategory(CategoryDto categoryDto);
	
//	update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
//	delete
	void deleteCategory( Integer categoryId);
	
//	get
	CategoryDto getCategory(Integer categoryId);
//	getall
	List<CategoryDto> getCategories();
}
