package com.example.insulin;

public class OrderPlacedEvent {
	
	private int order;
	
	public OrderPlacedEvent() {}

	/**
	 * @param order
	 */
	public OrderPlacedEvent(int order) {
		this.order = order;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}
	
	

}
