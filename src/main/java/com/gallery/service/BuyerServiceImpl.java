package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gallery.model.Buyer;
import com.gallery.repository.BuyerRepository;
import com.gallery.repository.GalleryRepository;
@Service("buyerService")
@Transactional
public class BuyerServiceImpl implements BuyerService{
	@Autowired
	private BuyerRepository buyerRepository;
	@Override
	public Buyer findGalleryByGalleryName(String galleryname) {
		// TODO Auto-generated method stub
		return buyerRepository.findByGalleryName(galleryname);
	}
	@Override
	public void saveBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		buyerRepository.save(buyer);
		
	}
	@Override
	public Buyer findByUserId(int id) {
		// TODO Auto-generated method stub
		return buyerRepository.findByUserId(id);
	}
	@Override
	public List<Buyer> findAll() {
		// TODO Auto-generated method stub
		return buyerRepository.findAll();
	}

}
