package com.khan.vaquar.domain;
/**
 * 
 * @author vaquar khan
 *
 */
public class Data {

	private String longDescription;

	private String pageCount;

	private String isbn;

	private String _id;

	private PublishedDate publishedDate;

	private String shortDescription;

	private String[] categories;

	private String title;

	private String thumbnailUrl;

	private String status;

	private String[] authors;

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public PublishedDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(PublishedDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "ClassPojo [longDescription = " + longDescription + ", pageCount = " + pageCount + ", isbn = " + isbn
				+ ", _id = " + _id + ", publishedDate = " + publishedDate + ", shortDescription = " + shortDescription
				+ ", categories = " + categories + ", title = " + title + ", thumbnailUrl = " + thumbnailUrl
				+ ", status = " + status + ", authors = " + authors + "]";
	}
}
