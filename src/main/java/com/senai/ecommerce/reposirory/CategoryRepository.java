package com.senai.ecommerce.reposirory;


import com.senai.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
