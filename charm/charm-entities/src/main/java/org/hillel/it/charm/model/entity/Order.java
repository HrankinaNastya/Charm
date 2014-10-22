package org.hillel.it.charm.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="ORDERS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverride(name="id", 
column = @Column(name="order_id", 
insertable=false, updatable=false))
@NamedQueries({@NamedQuery(name="getOrders", query="from Order"), 
	@NamedQuery(name="getOrdersByUserId", query="from Order "
			+ "where user_id = :id"),
	@NamedQuery(name="deleteOrders", query="delete Order"), 
	@NamedQuery(name="deleteOrdersByUserId", query="delete Order "
			+ "where user_id = :id"),
	@NamedQuery(name="deleteOrderById", query="delete Order "
			+ "where order_id = :id")
})
public class Order extends BaseEntity{
	public static final String GET_ORDERS = "getOrders";
	public static final String GET_ORDERS_BY_USER_ID = 
			"getOrdersByUserId";
	public static final String DELETE_ORDERS = "deleteOrders";
	public static final String DELETE_ORDER_BY_ID = "deleteOrderById";
	public static final String DELETE_ORDER_BY_USER_ID = 
			"deleteOrdersByUserId";
	
	private Product product;
	private int amount;
	private int cost;
	private boolean isPaid = false;
	
	public Order(){
		super();
	}
	
	public Order(int amount, Product product, int cost){
		this.product = product;
		this.amount = amount;
		setCost(cost);
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
	
	@OneToOne
	@JoinColumn(name="productId",referencedColumnName="product_id")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name="amount")
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Column(name="cost")
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = amount * cost;
	}

	@Column(name="isPaid")
	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	@Override
	public String toString() {
		return "Order [product=" + product.getId() + ", amount=" 
				+ amount + ", cost=" + cost + ", isPaid=" + isPaid
				+ ", id=" + id + ", getCreatedBy()=" + getCreatedBy().
				getId() + "]";
	}
	
	
}
