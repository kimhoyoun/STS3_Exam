package org.comstudy21.member;

public class MemberDto {
	private static int seq = 0;
	private int no;
	private String id;
	private String name;
	private String pass;
	private String email;
	
	public MemberDto() {
		this(0,"","","","");
	}
	
	public MemberDto(int no,String id, String name, String pass, String email) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDto other = (MemberDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}
	
	public static int nextSeq() {
		return ++seq;
	}
}
