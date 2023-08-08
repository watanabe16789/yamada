package com.higashi.store.util;

import java.sql.Timestamp;

/**
 * データ取得クラス
 * 
 * @author 佐藤正路ダニエル
 *
 */
public class DataUtil {

	/**
	 * 現在日時を取得する
	 * 
	 * @return 現在日時
	 */
	public static Timestamp getNowDate() {
		return new Timestamp(System.currentTimeMillis());
	}

}
