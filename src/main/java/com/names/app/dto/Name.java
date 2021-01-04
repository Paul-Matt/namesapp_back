package com.names.app.dto;

import org.springframework.lang.NonNull;

public class Name {
	@NonNull
	private String name;
	private int amount;

	public Name() {
	}

	public Name(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// Frontend needs a unique id per item, the hashcode can do the trick
	public long getId() {
		return hashCode();
	}

	@Override
	public String toString() {
		return String.format("Name [id= %d , name= %s, amount= %d]", hashCode(), name, amount);
	}

	@Override
	public int hashCode() {
		return name.hashCode() * 13 + amount * 11;
	}
}
