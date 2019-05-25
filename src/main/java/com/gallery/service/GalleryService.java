package com.gallery.service;
import java.util.List;

import com.gallery.model.gallery;

public interface GalleryService {
	public gallery findGalleryByGalleryName(String galleryname);
	 /*public List<Course> findCourseByCourseName(String coursename);*/
	public void saveGallery(gallery gallery);
   
   gallery findByGalleryId(int id);
  public List<gallery> findAll();
 
}
