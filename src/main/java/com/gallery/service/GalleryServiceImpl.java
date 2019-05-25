package com.gallery.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import antlr.collections.List;
import com.gallery.model.gallery;
import com.gallery.repository.GalleryRepository;
@Service("galleryService")
@Transactional
public class GalleryServiceImpl implements GalleryService{
	@Autowired
	private GalleryRepository galleryRepository;
	@Override
	public void saveGallery(gallery gallery) {
		// TODO Auto-generated method stub
		galleryRepository.save(gallery);
	}

	@Override
	public gallery findGalleryByGalleryName(String galleryname) {
		// TODO Auto-generated method stub
		return galleryRepository.findByGalleryName(galleryname);
	}
	/*@Override
	public gallery findGalleryById(int id) {
		// TODO Auto-generated method stub
		return galleryRepository.findGalleryById(id);
	}*/
	@Override
	public java.util.List<gallery> findAll() {
		// TODO Auto-generated method stub
		return galleryRepository.findAll();
	}
	@Override
	public gallery findByGalleryId(int id) {
		// TODO Auto-generated method stub
		return galleryRepository.findByGalleryId(id);
	}
	
	/*@Override
	public java.util.List<Course> findAll() {
		// TODO Auto-generated method stub
     return courseRepository.findAll();
}
	@Override
	public Course findByCourseId(int id) {
		// TODO Auto-generated method stub
		return courseRepository.findByCourseId(id);
	}
*/

}
