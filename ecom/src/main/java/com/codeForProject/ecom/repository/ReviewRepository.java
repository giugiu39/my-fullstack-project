package com.codeForProject.ecom.repository;

import com.codeForProject.ecom.entity.FAQ;
import com.codeForProject.ecom.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByProductId(Long productsId);

}
