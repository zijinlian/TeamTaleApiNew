package com.work.mapper;

import java.util.List;
import java.util.Map;

import com.work.bean.PartyBean;
import com.work.entity.TGroupInfo;
import com.work.entity.TPartyIncorrupt;
import com.work.entity.TPartyInfoMember;

public interface TPartyMapper {
	/**
	 * <!-- 查询当前用户党建节点 -->
	 * @param bean
	 * @return
	 */
	Map<String, Object> selectUserPartyId(PartyBean bean);
	
	/**
	 * 党务信息列表
	 * @param bean
	 * @return
	 */
	List<Map<String, Object>> selectPartyByPId(PartyBean bean);

	/**
	 * 查询根节点
	 * @param bean
	 * @return
	 */
	List<Map<String,Object>> selectRootParyByLevel(PartyBean bean);

	/**
	 *
	 * @param bean
	 * @return
	 */
	List<TPartyInfoMember> selectGroupInfoById(PartyBean bean);

	/**
	 *
	 * @param bean
	 * @return
	 */
	 int selectPartyCount(PartyBean bean);

	/**
	 *
	 * @return
	 */
	int selectCountOfAllPeople();

	/**
	 *
	 * @param bean
	 * @return
	 */
	List<TGroupInfo> selectGroupInfo(PartyBean bean);

	/**
	 *  党务成员信息
	 * @param bean
	 * @return
	 */
	TPartyInfoMember  selectPartyInfoById(PartyBean bean);


	List<TPartyIncorrupt> selectPartyIncrorrupt();
	
	List<Map<String, Object>> selectPartyIsNode(PartyBean bean);



}
