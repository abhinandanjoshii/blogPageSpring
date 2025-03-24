package com.blobProj.abhiJ.abhinandanJoshi.Blog.Controller;

import com.blobProj.abhiJ.abhinandanJoshi.Blog.Model.Blog;
import com.blobProj.abhiJ.abhinandanJoshi.Blog.Services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }

    @PostMapping
    public Blog addBlog(@RequestBody Blog blog) {
        return blogService.addBlog(blog);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
        return blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBlog(@PathVariable Long id) {
        return blogService.deleteBlog(id);
    }
}