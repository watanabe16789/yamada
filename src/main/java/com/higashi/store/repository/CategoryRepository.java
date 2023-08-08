package com.higashi.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higashi.store.entity.Category;

/**
 * categoriesテーブル用リポジトリ
 *
 * @author System Shared
 */

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	Category findByNameAndDeleteFlag(String name, int deleteFlag);

	Category findByIdAndDeleteFlag(Integer id, int deleteFlag);

	// カテゴリ情報を登録日付順に取得
	List<Category> findByDeleteFlagOrderByInsertDateDescIdAsc(int deleteFlag);

}
