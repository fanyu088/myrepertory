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
@Table ( name ="unread_dialogue" )
public class UnreadDialogue  implements Serializable {

	private static final long serialVersionUID =  8293348752618531130L;

   	@Column(name = "id" )
	private Long id;

   	@Column(name = "chatId" )
	private String chatId;

   	@Column(name = "sender" )
	private String sender;

   	@Column(name = "receiver" )
	private String receiver;

   	@Column(name = "content" )
	private String content;

   	@Column(name = "type" )
	private Long type;

   	@Column(name = "timestamp" )
	private Long timestamp;

   	@Column(name = "bussType" )
	private Long bussType;

   	@Column(name = "messageId" )
	private Long messageId;

}
