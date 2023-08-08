package com.higashi.store.util;

/**
 * 定数定義用クラス
 *
 * @author SystemShared
 */
public class Constant {
	/** 削除フラグの値(未削除状態) */
	public static final int		NOT_DELETED			= 0;

	/** 削除フラグの値(削除状態) */
	public static final int		DELETED				= 1;

	/** インデックス番号の初期値 */
	public static final int		DEFAULT_INDEX		= 1;

	/** 表示順の初期値(新着順) */
	public static final int		DEFAULT_SORT_TYPE	= 1;

	/** 戻るフラグの値（戻るボタン押下時） */
	public static final int 		BACK_FLG_TRUE = 1;
	
	/**権限（システム管理者）*/
	public static final int		システム管理者 = 0;
	
	/**権限（運用管理者）*/
	public static final int		運用管理者 = 1;
	
	/**権限（一般会員）*/
	public static final int		一般会員 = 2;
	
	/**商品一覧（新着順）*/
	public static final int		商品新着順表示 =1;
	
	/** カテゴリ別検索（新着順）*/
	public static final int		カテゴリ別新着順表示=1;
	
	
	/**
	 * 商品画像のアップロード先 (注意) ファイルの保存場所はeclipseの環境構築の操作内容によってことなる場合があります。
	 * ファイルアップロードに失敗した場合は、下記のパスを修正してください。
	 */
	public static final String FILE_UPLOAD_PATH = "C:/Users/edu/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/shared_shop/src/main/resources/static/img";
	
	/** CSS保存用フォルダの名前 */
	public static final String CSS_FOLDER = "/css/";
	
	/** 画像ファイル保存用フォルダの名前 */
	public static final String IMAGE_FOLDER = "/img/";
}
