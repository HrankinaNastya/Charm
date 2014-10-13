package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Group;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.SubGroup;

public interface GroupRepository {
	
	public void addGroup(Group group);
	public void addSubGroup(SubGroup subGroup);
	public void addProduct(Product product);
	
	public void updateGroup(Group group);
	public void updateSubGroup(SubGroup subGroup);
	public void updateProduct(Product product);
	
	public Group getGroup(int id);
	public SubGroup getSubGroup(int id);
	public Product getProduct(int id);

	public List<Group> getGroups();
	public List<SubGroup> getSubGroups();
	public List<SubGroup> getSubGroups(Group group);
	public List<Product> getProducts();
	public List<Product> getProducts(SubGroup subgroup);
	
	public void deleteGroups();
	public void deleteGroup(int id);
	public void deleteSubGroups();
	public void deleteSubGroups(Group group);
	public void deleteSubGroup(int id);
	public void deleteProducts();
	public void deleteProducts(SubGroup subgroup);
	public void deleteProduct(int id);

}
