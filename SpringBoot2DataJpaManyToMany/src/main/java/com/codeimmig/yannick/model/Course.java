package com.codeimmig.yannick.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="crstab")
public class Course {
	
	@Id
	@Column(name="cid")
	private Integer crsId;
	@Column(name="cname")
	private String crsName;
	@Column(name="cfee")
	private Double crsFee;
	
	
}