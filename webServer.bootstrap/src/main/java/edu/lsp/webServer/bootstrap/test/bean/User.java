package edu.lsp.webServer.bootstrap.test.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lsp_user")
public class User implements Serializable {

	public User() {
	}

	public User(Integer accountId, Integer balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	private Integer accountId;
	private Integer balance;

}