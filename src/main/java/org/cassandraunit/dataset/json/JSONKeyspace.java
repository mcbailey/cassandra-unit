package org.cassandraunit.dataset.json;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jeremy Sevellec
 * 
 */
public class JSONKeyspace {

	private String name;
	private int replicationFactor = 1;
	private String strategy = "org.apache.cassandra.locator.SimpleStrategy";
	private List<JSONColumnFamily> columnFamilies = new ArrayList<JSONColumnFamily>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReplicationFactor() {
		return replicationFactor;
	}

	public void setReplicationFactor(int replicationFactor) {
		this.replicationFactor = replicationFactor;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String stategy) {
		this.strategy = stategy;
	}

	public void setColumnFamilies(List<JSONColumnFamily> columnFamilies) {
		this.columnFamilies = columnFamilies;
	}

	public List<JSONColumnFamily> getColumnFamilies() {
		return columnFamilies;
	}

}