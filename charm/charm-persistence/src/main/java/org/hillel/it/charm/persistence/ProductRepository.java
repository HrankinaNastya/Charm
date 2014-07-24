package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;

public interface ProductRepository {
	
	public void addGroup(Group group);
	public void addSubGroup(SubGroup subGroup);
	public void addProduct(Product product);

	public List<Group> getGroups();
	public List<SubGroup> getSubGroups();
	public List<Product> getProducts();

	public Group getGroup(int id);
	public SubGroup getSubGroup(int id);
	public Product getProduct(int id);
	
	public void deleteGroups();
	public void deleteGroup(int id);
	public void deleteSubGroups(Group group);
	public void deleteSubGroup(Group group, int id);
	public void deleteProducts(Group group, SubGroup subgroup);
	public void deleteProduct(Group group, SubGroup subgroup, int id);

}
