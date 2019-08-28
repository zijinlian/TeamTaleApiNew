package com.work.common.md5;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class DESUtil {

	/**
	 * 加密
	 * 
	 * @param encryptString
	 * @param encryptKey
	 * @return
	 * @throws Exception
	 */
	public static String encryptDES(String encryptString, String encryptKey) throws Exception {
		SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedData = cipher.doFinal(encryptString.getBytes("UTF-8"));

		return Base64.encode(encryptedData);
	}

	/**
	 * 解密
	 * 
	 * @param decryptString
	 * @param decryptKey
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public static String decryptDES(String decryptString, String decryptKey) throws Exception {
		byte[] byteMi = new Base64().decode(decryptString);
		SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte decryptedData[] = cipher.doFinal(byteMi);

		return new String(decryptedData);
	}

}
