package com.higashi.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higashi.store.entity.User;

/**
 * usersテーブル用リポジトリ
 *
 * @author System Shared
 */
@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
	
	// メールアドレスに該当する会員情報を検索（メールアドレスのみ）
	User findByEmail(String email);

	// メールアドレスに該当する会員情報を検索
	User findByEmailAndDeleteFlag(String email, int deleteFlag);

	// 削除フラグに合った会員情報をすべて検索
	List<User> findByDeleteFlagOrderByInsertDateDescIdAsc(int deleteFlag);
}
