package com.vamertyv.myblog.dao;

import com.vamertyv.myblog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
