package com.craftyn.casinoslots.slot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.craftyn.casinoslots.CasinoSlots;

public class Type {
	
	protected CasinoSlots plugin;
	
	private String name, itemCost = String.valueOf(0);
	private Double cost = Double.valueOf(0), createCost = Double.valueOf(0);
	private ArrayList<String> reel;
	private Map<String, String> messages;
	private List<String> helpMessages;
	private Map<String, Reward> rewards;
	
	// Initialize new type
	public Type(String name, Double cost, String itemCost, Double createCost, ArrayList<String> reel, Map<String, String> messages, List<String> helpMessages, Map<String, Reward> rewards) {
		
		this.name = name;
		this.cost = cost;
		this.itemCost = itemCost;
		this.createCost = createCost;
		this.reel = reel;
		this.messages = messages;
		this.helpMessages = helpMessages;
		this.rewards = rewards;
		
	}
	
	// Returns type name
	public String getName() {
		return this.name;
	}
	
	// Returns type use cost
	public Double getCost() {
		return this.cost;
	}
	
	/** Gets the item that this type costs to use. */
	public String getItemCost() {
		return this.itemCost;
	}
	
	public Double getCreateCost() {
		return this.createCost;
	}
	
	// Returns type reel
	public ArrayList<String> getReel() {
		return this.reel;
	}
	
	// Returns map of type messages
	public Map<String, String> getMessages() {
		return this.messages;
	}
	
	// Returns help messages
	public List<String> getHelpMessages() {
		return this.helpMessages;
	}
	
	// Returns type reward of id
	public Reward getReward(String id) {
		return this.rewards.get(id);
	}
	
	// Set type use cost
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	/** Sets the item that this slot costs to use. */
	public void setItemCost(String itemCost) {
		this.itemCost = itemCost;
	}
	
	// Set type use cost
	public void setCreateCost(Double createCost) {
		this.createCost = createCost;
	}
}