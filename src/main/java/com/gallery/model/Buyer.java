package com.gallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "buyer_id")
	    private int buyerId;
	    @Column(name = "user_id")
	    private int userId;
	    @Column(name = "galleryId")
	    private int galleryId;
	    @Column(name = "user_name")
	    private String userName;
	    @Column(name = "gallery_name")
	    private String galleryName;
		public int getBuyerId() {
			return buyerId;
		}
		public void setBuyerId(int buyerId) {
			this.buyerId = buyerId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getGalleryId() {
			return galleryId;
		}
		public void setGalleryId(int galleryId) {
			this.galleryId = galleryId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getGalleryName() {
			return galleryName;
		}
		public void setGalleryName(String galleryName) {
			this.galleryName = galleryName;
		}
	    

}
