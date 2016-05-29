package com.grundfos.generator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="byName",query="from CompDetail where name = ?")
})
public class CompDetail {
	
	@Id
	@Column(name="identifier")
	private Integer id;
	
	@Column(name="name")
	private String name;

	
	
}
