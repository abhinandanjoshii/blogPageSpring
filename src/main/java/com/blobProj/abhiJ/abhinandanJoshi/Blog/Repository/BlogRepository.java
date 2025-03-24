package com.blobProj.abhiJ.abhinandanJoshi.Blog.Repository;
import com.blobProj.abhiJ.abhinandanJoshi.Blog.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}