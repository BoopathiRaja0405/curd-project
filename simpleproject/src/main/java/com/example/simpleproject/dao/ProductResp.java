package com.example.simpleproject.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleproject.model.*;

public interface ProductResp extends JpaRepository <Product,Long> {

}
