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
@Table ( name ="system_config" )
public class SystemConfig  implements Serializable {

	private static final long serialVersionUID =  3855201289890976622L;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "appid" )
	private String appid;

   	@Column(name = "csGreeting" )
	private String csGreeting;

   	@Column(name = "csSlogan" )
	private String csSlogan;

}
