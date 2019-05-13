package swagger.test.domain;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User", description = "用户对象")
public class User {

	@ApiModelProperty(value = "ID", example = "1")
	private int id;
	@ApiModelProperty(value = "姓名", example = "张三")
	private String username;
	@ApiModelProperty(value = "年龄", access = "hidden")
	private int age;
	@ApiModelProperty(value = "时间戳", example = "2019-5-13 17:40:47")
	private Date ctm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCtm() {
		return ctm;
	}
	public void setCtm(Date ctm) {
		this.ctm = ctm;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", ctm=" + ctm + "]";
	}
}