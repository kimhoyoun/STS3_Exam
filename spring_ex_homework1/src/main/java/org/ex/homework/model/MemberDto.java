package org.ex.homework.model;

public class MemberDto {
private int no;
private String name;
private String id;
private String pw;
private String email;

public MemberDto() {
	this(0,"","","","");
}

public MemberDto(int no, String name, String id, String pw, String email) {
	this.no = no;
	this.name = name;
	this.id = id;
	this.pw = pw;
	this.email = email;
}

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
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
	result = prime * result + ((pw == null) ? 0 : pw.hashCode());
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
	if (pw == null) {
		if (other.pw != null)
			return false;
	} else if (!pw.equals(other.pw))
		return false;
	return true;
}
@Override
public String toString() {
	return "MemberDto [no=" + no + ", name=" + name + ", id=" + id + ", pw=" + pw + ", email=" + email + "]";
}

}
