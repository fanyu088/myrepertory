package com.example.RO;

import javax.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-07-31 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="app_hot_update" )
public class AppHotUpdate  implements Serializable {

	private static final long serialVersionUID =  3555612341699643455L;

   	@Id
	@Column(name = "id" )
	private Long id;

   	@Column(name = "app_type" )
	private String appType;

   	@Column(name = "app_id" )
	private String appId;

   	@Column(name = "update_type" )
	private Long updateType;

   	@Column(name = "version" )
	private String version;

   	@Column(name = "start_time" )
	private Long startTime;

   	@Column(name = "end_time" )
	private Long endTime;

   	@Column(name = "tip_words" )
	private String tipWords;

   	@Column(name = "tip_type" )
	private Long tipType;

   	@Column(name = "remark" )
	private String remark;

}
