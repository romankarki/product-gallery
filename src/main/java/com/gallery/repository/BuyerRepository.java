package com.gallery.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gallery.model.Buyer;
	public interface BuyerRepository extends JpaRepository<Buyer, Integer>{
		  Buyer findByGalleryName(String galleryname);
		 Buyer findByUserId(int id);
		//gallery findGalleryById(int id);

}
