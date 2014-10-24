package org.hillel.it;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.hillel.it.charm.model.entity.Category;
import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Order;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.Size;
import org.hillel.it.charm.model.entity.SubGroup;
import org.hillel.it.charm.model.entity.User;
import org.hillel.it.charm.persistence.AppConfig;
import org.hillel.it.charm.persistence.GroupRepository;
import org.hillel.it.charm.persistence.UserRepository;
import org.hillel.it.charm.service.CharmService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@Component
public class CharmTest {
	@Autowired
	private CharmService charmService;
	private static User user;
	private static Group group;
	private static SubGroup subgroup;
	private static Product product;
	private static Comment comment;
	private static Order order;

	@Before
	public void addUserTest() {	
		user = new User();
		user.setName("Anastasiia");
		user.setPhone("777-77-77");
		user.setCategory(Category.Administrator);
		user.setEmail("aaa@mail.ru");
		user.setLogin("nastya");
		user.setPass("nastyaa");
		user.setCreatedAt(new Date());
		charmService.addUser(user);
		System.out.println(charmService.getUser(1));
	}
	
	@Test
	public void CharmTest() {	
		group = new Group();
		group.setNameGroup("dresses");
		group.setCreatedAt(new Date());
		group.setCreatedBy(charmService.getUser(1));
		charmService.addGroup(group);
		group.setId(1);
		
		Group gr = charmService.getGroup(1);
		System.out.println(gr.toString());
		assertEquals(group.toString(),gr.toString());
		
		subgroup = new SubGroup();
		subgroup.setGroup(charmService.getGroup(1));
		subgroup.setNameSubGroup("evening");
		subgroup.setCreatedAt(new Date());
		subgroup.setCreatedBy(charmService.getUser(1));
	
		charmService.addSubGroup(subgroup);
		subgroup.setId(1);
		
		SubGroup subgr = charmService.getSubGroup(1);
		System.out.println(subgr.toString());
		assertEquals(subgroup.toString(),subgr.toString());
		
		product = new Product();
		product.setSubGroup(charmService.getSubGroup(1));
		product.setNameProduct("eveningDress1");
		product.setSize(Size.M);
		product.setCost(300);
		product.setCurrency("UAH");
		product.setPhoto("D:\\images\1.jpg");
		product.setCreatedAt(new Date());
		product.setCreatedBy(charmService.getUser(1));
		
		charmService.addProduct(product);
		product.setId(1);
	
		Product pr = charmService.getProduct(1);
		System.out.println(pr.toString());
		assertEquals(product.toString(),product.toString());
		
		comment = new Comment();
		comment.setComment("Good");
		comment.setProduct(charmService.getProduct(1));
		comment.setCreatedAt(new Date());
		comment.setCreatedBy(charmService.getUser(1));
		
		charmService.addComment(comment);
		comment.setId(1);
		
		Comment com = charmService.getComment(1);
		System.out.println(com.toString());
		assertEquals(comment.toString(),com.toString());
		
		order = new Order();
		order.setProduct(charmService.getProduct(1));
		order.setAmount(2);
		order.setCost(charmService.getProduct(1).getCost());
		order.setCreatedAt(new Date());
		order.setCreatedBy(charmService.getUser(1));
		
		charmService.addOrder(order);
		order.setId(1);
		order.setCost(charmService.getProduct(1).getCost()*2);
		
		Order ord = charmService.getOrder(1);
		System.out.println(ord.toString());
		assertEquals(order.toString(),ord.toString());
		
	}
	
}