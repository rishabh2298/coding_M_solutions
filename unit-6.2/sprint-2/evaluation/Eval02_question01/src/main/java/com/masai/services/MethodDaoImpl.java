package com.masai.services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.entity.Item;
import com.masai.entity.Order;
import com.masai.exception.NotFoundException;
import com.masai.util.EMUtil;

public class MethodDaoImpl implements MethodDao {

	public void createItem(Item item, Order order) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		item.setOrder(order);
		
		em.persist(item);
		
		em.getTransaction().commit();
		
		em.close();
	}

	public void createItems(List<Item> items, Order order) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		for(Item item : items) {
			item.setOrder(order);
			em.persist(item);
		}
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public void getItem(int itemId) throws NotFoundException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Item item = em.find(Item.class, itemId);
		
		if(item==null) throw new NotFoundException("This Item is not present");
		
		System.out.println("Item ID = "+item.getItemId());
		System.out.println("Item Name = "+item.getName());
		System.out.println("Created At = "+item.getCreateAt());
		System.out.println("Delivery Data = "+item.getEstimatedDeliveryDate());
		System.out.println("Order = "+item.getOrder());
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public void getOrder(int orderId) throws NotFoundException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Order order = em.find(Order.class, orderId);
		
		if(order==null) throw new NotFoundException("This order is not exist");
		
		System.out.println("Order Id = "+order.getOrderId());
		System.out.println(""+order.getDeliveryAddress());
		System.out.println(""+order.getTotalAmount());
		System.out.println(""+order.getCreateAt());
		
		System.out.println("Items under this order");
		order.getItems().forEach(item -> System.out.println(item));
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public void getItems(LocalDate inputDate) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		List<Item> items = (List<Item>)em.createNativeQuery("select * from Item where estimatedDeliveryDate >"+inputDate, Item.class).getResultList();
		
		if(items.isEmpty()) System.out.println("All Items are expected to be delever on Time");
		else {
			
			for(Item item : items) {
				System.out.println("Item ID = "+item.getItemId());
				System.out.println("Item Name = "+item.getName());
				System.out.println("Created At = "+item.getCreateAt());
				System.out.println("Delivery Data = "+item.getEstimatedDeliveryDate());
				System.out.println("Order = "+item.getOrder());				
			}
		}
		
		em.getTransaction().commit();
		
		em.close();
	}

}
