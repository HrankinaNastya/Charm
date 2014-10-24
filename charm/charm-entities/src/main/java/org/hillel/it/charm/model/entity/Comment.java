package org.hillel.it.charm.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="COMMENTS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@AttributeOverride(name="id", column = @Column(name="comment_id", 
insertable=false, updatable=false))
@NamedQueries({@NamedQuery(name="getComments", query="from Comment"), 
	@NamedQuery(name="deleteComments", query="delete Comment"), 
	@NamedQuery(name="deleteCommentById", query="delete Comment "
			+ "where comment_id = :id"),
	@NamedQuery(name="deleteCommentsByUserId", query="delete Comment "
			+ "where user_id = :id"),
	@NamedQuery(name="deleteCommentsByProductId", query="delete Comment "
			+ "where product_id = :id"),
	@NamedQuery(name="getCommentsByUserId", query="from Comment "
			+ "where user_id = :id"),
	@NamedQuery(name="getCommentsByProductId", query="from Comment "
			+ "where product_id = :id")})

public class Comment extends BaseEntity{
	public static final String GET_COMMENTS = "getComments";
	public static final String DELETE_COMMENTS = "deleteComments";
	public static final String DELETE_COMMENT_BY_ID = "deleteCommentById";
	public static final String DELETE_COMMENT_BY_USER_ID = "deleteCommentsByUserId";
	public static final String DELETE_COMMENT_BY_PRODUCT_ID = 
			"deleteCommentsByProductId";
	public static final String GET_COMMENT_BY_USER_ID = "getCommentsByUserId";
	public static final String GET_COMMENT_BY_PRODUCT_ID = 
			"getCommentsByProductId";
	
	private String comment;
	private Product product;
	
	public Comment(){
		super();
	}
	
	public Comment(String comment, Product product) {
		this.comment = comment;
		this.product = product;
	}
	
	@Override
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="commentary",length=32,nullable=false)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="productId", 
	referencedColumnName="product_id")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Comment [comment=" + comment + ", product=" + product.
				getId() + ", id=" + id + ", getCreatedBy()=" + getCreatedBy().
				getId() + "]";
	}
	
	
	
}
