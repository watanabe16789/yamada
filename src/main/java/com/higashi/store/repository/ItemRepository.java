package com.higashi.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.higashi.store.entity.Item;
import com.higashi.store.util.JPQLConstant;

/**
 * itemsテーブル用リポジトリ
 *
 * @author System Shared
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	
	/** 商品一覧表示
	 * @return
	 */
	@Query(JPQLConstant.FIND_ALL_ORDERS_ORDER_BY_INSERT_DATE)
	public List<Item> findAllOrderByItem();
	
	/**
	 * 売れ筋順表示
	 * @return
	 */
	@Query(JPQLConstant.FIND_ORDER_BY_ORDER_COUNT)
	public List<Item>findAllOrderById();
	
	/**  商品情報を新着順で検索
	 * @param deleteFlag
	 * @return
	 */
	public List<Item> findByDeleteFlagOrderByInsertDateDescIdAsc(int deleteFlag);
	
	
	/**
	 * カテゴリー別検索（新着順）
	 * @param categoryId
	 * @return
	 */
	@Query(JPQLConstant.FIND_BY_CATEGORY_ID_ORDER_BY_INSERT_DATE)
	public List<Item>findByCategoryIdOrderByInsertDate(@Param("categoryId")int categoryId);
	
	/**
	 * カテゴリー別検索（売れ筋順）
	 * @param categoryId
	 * @return
	 */
	@Query(JPQLConstant.FIND_BY_CATEGORY_ID_ORDER_BY_ORDER_COUNT)
	public List<Item>findByCategoryIdOrderById(@Param("categoryId") int categoryId);
	
	
}
