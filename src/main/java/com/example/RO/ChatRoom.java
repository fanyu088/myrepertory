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
@Table ( name ="chat_room" )
public class ChatRoom  implements Serializable {

	private static final long serialVersionUID =  3279544016030696229L;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "roomId" )
	private String roomId;

   	@Column(name = "appid" )
	private String appid;

   	@Column(name = "owner" )
	private String owner;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "type" )
	private Long type;

   	@Column(name = "flag" )
	private String flag;

   	@Column(name = "enableChat" )
	private Integer enableChat;

   	@Column(name = "cover" )
	private String cover;

   	@Column(name = "number" )
	private Long number;

   	@Column(name = "enableRobot" )
	private Integer enableRobot;

	/**
	 * 允许发言的vip等级id
	 */
   	@Column(name = "chatLevel" )
	private Long chatLevel;

	/**
	 * 允许抢红包的vip等级id
	 */
   	@Column(name = "robPacketLevel" )
	private Long robPacketLevel;

	/**
	 * 允许进入房间的vip等级id
	 */
   	@Column(name = "accessLevel" )
	private Long accessLevel;

}
