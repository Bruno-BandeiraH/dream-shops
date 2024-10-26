package com.brunobandeira.dreamshops.repository;

import com.brunobandeira.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
