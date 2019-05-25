package com.gallery.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gallery.model.gallery;
	public interface GalleryRepository extends JpaRepository<gallery, Integer>{
		  gallery findByGalleryName(String galleryname);
		 gallery findByGalleryId(int id);
		//gallery findGalleryById(int id);

}

