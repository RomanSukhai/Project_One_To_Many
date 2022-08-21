package ua.lviv.lgs.model.one_to_many;

import java.util.Objects;
import java.util.Set;

public class Post {
	private Integer id;
	private String title;
	private Set<Comment> comment;
	public Post() {
		
	}
	public Post(Integer id, String title, Set<Comment> comment) {
		super();
		this.id = id;
		this.title = title;
		this.comment = comment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Comment> getComment() {
		return comment;
	}
	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(comment, id, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(id, other.id)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", comment=" + comment + "]";
	}
	
}
