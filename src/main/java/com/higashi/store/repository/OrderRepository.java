package com.higashi.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.higashi.store.entity.Order;
import com.higashi.store.util.JPQLConstant;

/**
 * ordersテーブル用リポジトリ
 *
 * @author System Shared
 */
@Repository

public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order findTop1ByOrderByInsertDateDesc();

	// 会員IDに該当する注文情報を注文日付順で検索
	List<Order> findByUserIdOrderByInsertDateDescIdAsc(int userId);

	// 注文日付順で注文情報すべてを検索
	@Query(JPQLConstant.FIND_ALL_ORDERS_ORDER_BY_INSERT_DATE)
	List<Order> findAllOrderByInsertDateDesc();
	
	// 注文日付順で注文情報すべてを検索
		@Query(value = JPQLConstant.FIND_ALL_ORDERS_ORDER_BY_INSERT_DATE_NATIVE, nativeQuery = true)
		List<Order> findAllOrderByInsertDateDesc(@Param("user_id") Integer userId);
}
