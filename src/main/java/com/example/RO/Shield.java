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
@Table ( name ="shield" )
public class Shield  implements Serializable {

	private static final long serialVersionUID =  1859983875134462394L;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "memberId" )
	private Long memberId;

   	@Column(name = "shieldingId" )
	private Long shieldingId;

	/**
	 * 备注
	 */
   	@Column(name = "markName" )
	private String markName;

}
