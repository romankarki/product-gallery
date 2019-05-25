package com.gallery.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "gallery")
public class gallery {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private int galleryId;
	    @Column(name = "product")
	    private String galleryName;
	    @Column(name = "description")
	    private String description;
	    @Column(name = "photo")
	    private String photo;
		public int getGalleryId() {
			return galleryId;
		}
		public void setGalleryId(int galleryId) {
			this.galleryId = galleryId;
		}
		
		public String getGalleryName() {
			return galleryName;
		}
		public void setGalleryName(String galleryName) {
			this.galleryName = galleryName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPhoto() {
			
			return (photo);
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}

}
