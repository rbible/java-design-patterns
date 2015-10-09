package com.iluwatar.intercepting.filter;

/**
 * Base class for order processing filters.
 * Handles chain management.
 *
 */
public abstract class AbstractFilter implements IFilter {

	private IFilter next;
	
	public AbstractFilter() {
	}

	public AbstractFilter(IFilter next) {
		this.next = next;
	}
	
	@Override
	public void setNext(IFilter filter) {
		this.next = filter;	
	}
	
	@Override
	public IFilter getNext() {
		return next;
	}

	@Override
	public IFilter getLast() {
		IFilter last = this;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		return last;
	}
	
	@Override
	public String execute(Order order) {
		if (getNext() != null) {
			return getNext().execute(order);
		} else {
			return "";
		}
	}
}
