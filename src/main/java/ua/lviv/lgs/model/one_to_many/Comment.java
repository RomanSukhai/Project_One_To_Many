package ua.lviv.lgs.model.one_to_many;

import java.util.Objects;

public class Comment {
	private Integer id;
	private String authorName;
	private Post post;
	public Comment( String authorName, Post post) {
		super();
		this.authorName = authorName;
		this.post = post;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, id, post);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(authorName, other.authorName) && Objects.equals(id, other.id)
				&& Objects.equals(post, other.post);
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", authorName=" + authorName + ", post=" + post + "]";
	}
	
	
}
