package com.tzl.entity;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String address;

    private Date birthday;
    
    private City city;
    
    private List<BankCard> bankCards;
    
    private List<Orders> orders;
    
    
    
    public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<BankCard> getBankCards() {
		return bankCards;
	}

	public void setBankCards(List<BankCard> bankCards) {
		this.bankCards = bankCards;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", birthday=" + birthday + ", city="
				+ city + ", bankCards=" + bankCards + ", orders=" + orders
				+ "]";
	}


    
    
    
}