package com.higashi.store.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.higashi.store.bean.OrderItemQuantityBean;
import com.higashi.store.entity.OrderItem;
import com.higashi.store.util.JPQLConstant;

/**
 * order_itemsテーブル用リポジトリ
 *
 * @author System Shared
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

//	@Query(JPQLConstant.FIND_ALL_ORDER_ITEMS_ORDER)
//	public List<OrderItem>findAllOrderItem();

	//売上順
	@Query(value = JPQLConstant.FIND_ALL_ORDER_ITEMS_ORDER_NATIVE, nativeQuery = true)
	public List<Object[]> getAllOrderItem();

	default List<OrderItemQuantityBean> findAllOrderItem() {
		return getAllOrderItem().stream().map(OrderItemQuantityBean::new).collect(Collectors.toList());
	}

}
