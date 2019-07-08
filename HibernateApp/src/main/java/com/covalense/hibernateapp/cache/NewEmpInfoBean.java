package com.covalense.hibernateapp.cache;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name = "newemp_info")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class NewEmpInfoBean implements Serializable {
	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private String designation;
}
