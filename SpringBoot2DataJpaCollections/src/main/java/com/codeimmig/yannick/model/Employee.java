package com.codeimmig.yannick.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {
	
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	
	@ElementCollection
	@CollectionTable(name ="prjs_tab", joinColumns = @JoinColumn(name="eid"))
	@Column(name = "proj")
	private  Set<String> emPrjs;
	
	@ElementCollection
	@CollectionTable(name="vers_tab",//child table name
		joinColumns = @JoinColumn(name="eid")//key column
	)
	@Column(name="versns") //element column
	@MapKeyColumn(name="modulse") //index column
	private Map<String,Double> versions;
	
	@ElementCollection
	@CollectionTable(name="clients_tab", //child table
		joinColumns = @JoinColumn(name="eid") //key column
	)
	@Column(name="client_col")//element
	@OrderColumn(name="postion_col")//index
	private List<String> clients;
	
	

}
