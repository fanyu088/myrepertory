package com.example.demo5.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-10-01 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="agent_day_report" )
public class AgentDayReportRO  implements Serializable {

	private static final long serialVersionUID =  6397550690318459108L;

   	@Id
	@Column(name = "id" )
	private Long id;

   	@Column(name = "userId" )
	private String userId;

   	@Column(name = "account" )
	private String account;

   	@Column(name = "createDate" )
	private String createDate;

	/**
	 * 0 试玩  1 正式
	 */
   	@Column(name = "playType" )
	private Long playType;

	/**
	 * 存款总数 (自身)
	 */
   	@Column(name = "rechargeTotal" )
	private Double rechargeTotal;

	/**
	 * 提款总数 (自身)
	 */
   	@Column(name = "withdrawalTotal" )
	private Double withdrawalTotal;

	/**
	 * 投注 (自身)
	 */
   	@Column(name = "buyTotal" )
	private Double buyTotal;

	/**
	 * 中奖 (自身)
	 */
   	@Column(name = "winTotal" )
	private Double winTotal;

	/**
	 * 投注人数
	 */
   	@Column(name = "temNumberOfBets" )
	private Long temNumberOfBets;

	/**
	 * 返点 (自身)
	 */
   	@Column(name = "myRebateTotal" )
	private Double myRebateTotal;

	/**
	 * 返点(直属下级)
	 */
   	@Column(name = "childRebateTotal" )
	private Double childRebateTotal;

	/**
	 * 每日加奖 (自身)
	 */
   	@Column(name = "everydayAward" )
	private Double everydayAward;

	/**
	 * 晋级奖励 (自身)
	 */
   	@Column(name = "riseLevelAward" )
	private Double riseLevelAward;

	/**
	 * 存款赠送总额 (自身)
	 */
   	@Column(name = "rechargePresentTotal" )
	private Double rechargePresentTotal;

	/**
	 * 注册赠送总额 (自身)
	 */
   	@Column(name = "registerPresentTotal" )
	private Double registerPresentTotal;

	/**
	 * 总活动礼金
	 */
   	@Column(name = "giftMoney" )
	private Double giftMoney;

	/**
	 * 首充人数
	 */
   	@Column(name = "firstDepositUsers" )
	private Long firstDepositUsers;

	/**
	 * 注册人数
	 */
   	@Column(name = "regUsers" )
	private Long regUsers;

	/**
	 * 下级人数
	 */
   	@Column(name = "userTotal" )
	private Long userTotal;

	/**
	 * 团队盈利
	 */
   	@Column(name = "teamProfit" )
	private Long teamProfit;

	/**
	 * 团队返点
	 */
   	@Column(name = "rebateTotal" )
	private Double rebateTotal;

	/**
	 * 团队余额
	 */
   	@Column(name = "teamBalance" )
	private Double teamBalance;

	/**
	 * 手动加款 (自身)
	 */
   	@Column(name = "manualAddMoneyTotal" )
	private Double manualAddMoneyTotal;

	/**
	 * 手动扣款 (自身)
	 */
   	@Column(name = "manualSubtractMoneyTotal" )
	private Double manualSubtractMoneyTotal;

	/**
	 * 是否投注  0 否  1 是
	 */
   	@Column(name = "isBet" )
	private Long isBet;

	/**
	 * createDate数据单位：1 天  2 周 3 月
	 */
   	@Column(name = "dateType" )
	private Long dateType;

	/**
	 * 下级投注会员集合
	 */
   	@Column(name = "betNumberList" )
	private String betNumberList;

}
