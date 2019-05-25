package com.gallery.service;

import java.util.List;

import com.gallery.model.Buyer;

public interface BuyerService {
	public Buyer findGalleryByGalleryName(String galleryname);
	public void saveBuyer(Buyer buyer);
	Buyer findByUserId(int id);
	public List<Buyer> findAll();

}
