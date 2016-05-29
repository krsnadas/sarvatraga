package com.grundfos.generator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="byName",query="from EntityDetail where name = ?")
})
public class EntityDetail {
	
	@Id
	@Column(name="identifier")
	private Integer id;
	
	@Column(name="identifier")
	private String name;
	
	@Column(name="identifier")
	private Integer comp;

}
