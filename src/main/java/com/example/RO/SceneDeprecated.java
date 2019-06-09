package com.example.RO;

import javax.persistence.Id;
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
@Table ( name ="scene_deprecated" )
public class SceneDeprecated  implements Serializable {

	private static final long serialVersionUID =  6132158316278810991L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "businessId" )
	private Long businessId;

   	@Column(name = "businessAppid" )
	private String businessAppid;

   	@Column(name = "sceneName" )
	private String sceneName;

   	@Column(name = "sceneFlag" )
	private String sceneFlag;

   	@Column(name = "remark" )
	private String remark;

}
