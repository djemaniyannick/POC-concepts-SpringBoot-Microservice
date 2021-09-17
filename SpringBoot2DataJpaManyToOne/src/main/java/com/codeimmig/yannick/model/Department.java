package com.codeimmig.yannick.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="dept_tab")
public class Department {
	@Id
	@Column(name="did")
	private Integer deptId;
	@Column(name="dcode")
	private String deptCode;

}
