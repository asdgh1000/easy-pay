package com.easyPay.Bean;


import lombok.Data;

@Data
public class Role implements Comparable<Role>{
	private Integer id;
	private String name;
	private Integer roleLevel;
	private String description;
	private String menuItems;


	@Override
	public int compareTo(Role o) {
		if(id == o.getId()){
			return 0;
		}else if(id > o.getId()){
			return 1;
		}else{
			return -1;
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Role){
			if(this.id == ((Role)obj).getId()){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Role{" +
			"id=" + id +
			", name=" + name +
			", roleLevel=" + roleLevel +
			", description=" + description +
			'}';
		}
}
