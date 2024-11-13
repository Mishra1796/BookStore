package com.fmg.dto;

import com.fmg.entity.FMGNBookStoreEntity;


public class FMGNBookStoreDTO {
	
	
	private Long BookId;
	private String author;
	private Double price;
	private String status;
	private String summary;
	
	public FMGNBookStoreDTO(FMGNBookStoreEntity fmgnBookStore) {
		this.BookId=fmgnBookStore.getBookId();
		this.author=fmgnBookStore.getAuthor();
		this.price=fmgnBookStore.getPrice();
		this.status=fmgnBookStore.getStatus();
		this.summary=fmgnBookStore.getSummary();
	}

	public Long getBookId() {
		return BookId;
	}

	public void setBookId(Long bookId) {
		BookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "FMGNBookStoreDTO [BookId=" + BookId + ", author=" + author + ", price=" + price + ", status=" + status
				+ ", summary=" + summary + "]";
	}
	
	

}
