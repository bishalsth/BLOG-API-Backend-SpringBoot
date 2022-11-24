package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

public interface PostService {
	
//	create post
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId );
	
//	update post
	Post updatePost(PostDto postDto, Integer postId);

//	delete post
	void deletePost(Integer postId);
	
//	get all post
	List<PostDto> getAllPost();
	
//	get single post
	PostDto getPostById(Integer postId);
	
//	get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
//	get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
//	Search posts
	List<Post> searchPosts(String keyword);

}
