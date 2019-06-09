package com.example.RO;

import javax.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-06-09 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="scene" )
public class Scene  implements Serializable {

	private static final long serialVersionUID =  9148443139633270880L;

   	@Id
	@Column(name = "id" )
	private Long id;

   	@Column(name = "appid" )
	private String appid;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "flag" )
	private String flag;

   	@Column(name = "openidList" )
	private String openidList;

}
