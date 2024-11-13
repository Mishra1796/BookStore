package com.fmg.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmg.dto.FMGNBookStoreDTO;
import com.fmg.entity.FMGNBookStoreEntity;
import com.fmg.repo.FMGNBookStoreRepo;

@Service
public class FMGNBookStoreService {
	@Autowired
	FMGNBookStoreRepo repo;

	public List<FMGNBookStoreDTO> getAllBooks() {
		List<FMGNBookStoreDTO> booksList = new ArrayList<>();
		List<FMGNBookStoreEntity> books = repo.findAll();
		for (FMGNBookStoreEntity fmgnBookStoreEntity : books) {
			FMGNBookStoreDTO list = new FMGNBookStoreDTO(fmgnBookStoreEntity);
			booksList.add(list);
		}
		return booksList;	
	}

	public List<FMGNBookStoreDTO> getAllBookById(long bookId) {
		List<FMGNBookStoreDTO> booksList = new ArrayList<>();
		List<FMGNBookStoreEntity> books = repo.finByBookId(bookId);
		for (FMGNBookStoreEntity fmgnBookStoreEntity : books) {
			FMGNBookStoreDTO list = new FMGNBookStoreDTO(fmgnBookStoreEntity);
			booksList.add(list);
		}
		return booksList;
	}

	public String updateBookById(long bookId) {
		List<FMGNBookStoreEntity> books = repo.finByBookId(bookId);
		if(books.get(0).getStatus().equalsIgnoreCase("avilable")) {
		repo.updateBookStatus(bookId);
		return "Book updated as sold";
		}
		return "Book is already sold";
		
		
	}

}
