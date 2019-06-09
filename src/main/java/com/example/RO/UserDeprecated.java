package com.example.RO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-06-09 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="user_deprecated" )
public class UserDeprecated  implements Serializable {

	private static final long serialVersionUID =  3849392591620766309L;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "user_name" )
	private String userName;

   	@Column(name = "password" )
	private String password;

   	@Column(name = "age" )
	private Long age;

}
