package com.work.common.md5;

/**
 * Created by fangzhen on 16/2/5.
 */

//import android.util.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.*;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * RSA算法，实现数据的加密解密。
 * 
 * @author ShaoJiang
 * 
 */
@SuppressWarnings("restriction")
public class RsaJava {
	@SuppressWarnings("unused")
	private static final int MAX_ENCRYPT_BLOCK = 11700000;
	@SuppressWarnings("unused")
	private static final int MAX_DECRYPT_BLOCK = 12800000;
	private static Cipher cipher;
	public static String pubKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCAaOGuPsY8rmS7eMGssPuG/EKHs0ACkZ2o4+Aapk/B/dcKZf7h9TA394NsSOj3otuwM1f+j2rRnuxE2wZGJgU59IfQqQfGd+GnVSzrP9urIElVV5xD/54IofOFfc1UoMrylMMJU2ic1NewK7mXj0EV2EJE+FKOZ17UhRTHBPeXzQIDAQAB";
	// public static int base64flag = Base64.NO_WRAP;
	static {
		try {
			cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成密钥对
	 * 
	 * @param filePath
	 *            生成密钥的路径
	 * @return
	 */
	public static Map<String, String> generateKeyPair(String filePath) {
		try {
			KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
			// 密钥位数
			keyPairGen.initialize(1024);
			// 密钥对
			KeyPair keyPair = keyPairGen.generateKeyPair();
			// 公钥
			PublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
			// 私钥
			PrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
			// 得到公钥字符串
			String publicKeyString = getKeyString(publicKey);
			// 得到私钥字符串
			String privateKeyString = getKeyString(privateKey);
			// 将密钥对写入到文件
			FileWriter pubfw = new FileWriter(filePath + "/publicKey.keystore");
			FileWriter prifw = new FileWriter(filePath + "/privateKey.keystore");
			BufferedWriter pubbw = new BufferedWriter(pubfw);
			BufferedWriter pribw = new BufferedWriter(prifw);
			pubbw.write(publicKeyString);
			pribw.write(privateKeyString);
			pubbw.flush();
			pubbw.close();
			pubfw.close();
			pribw.flush();
			pribw.close();
			prifw.close();
			// 将生成的密钥对返回
			Map<String, String> map = new HashMap<String, String>();
			map.put("publicKey", publicKeyString);
			map.put("privateKey", privateKeyString);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 得到公钥
	 * 
	 * @param key
	 *            密钥字符串（经过base64编码）
	 * @throws Exception
	 */
	public static PublicKey getPublicKey(String key) throws Exception {
		byte[] keyBytes;
		keyBytes = (new BASE64Decoder()).decodeBuffer(key);
		// keyBytes = Base64.decode(key, base64flag);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = keyFactory.generatePublic(keySpec);
		return publicKey;
	}

	/**
	 * 得到私钥
	 * 
	 * @param key
	 *            密钥字符串（经过base64编码）
	 * @throws Exception
	 */
	public static PrivateKey getPrivateKey(String key) throws Exception {
		byte[] keyBytes;
		keyBytes = (new BASE64Decoder()).decodeBuffer(key);
		// keyBytes = Base64.decode(key, base64flag);
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
		return privateKey;
	}

	/**
	 * 得到密钥字符串（经过base64编码）
	 * 
	 * @return
	 */
	public static String getKeyString(Key key) throws Exception {
		byte[] keyBytes = key.getEncoded();
		String s = (new BASE64Encoder()).encode(keyBytes);
		// String s = Base64.encodeToString(keyBytes,base64flag);
		return s;
	}

	/**
	 * 使用公钥对明文进行加密，返回BASE64编码的字符串
	 * 
	 * @param publicKey
	 * @param plainText
	 * @return
	 */
	public static String encrypt(PublicKey publicKey, String plainText) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] enBytes = cipher.doFinal(plainText.getBytes());
			return (new BASE64Encoder()).encode(enBytes);
			// return Base64.encodeToString(enBytes,base64flag);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 加密
	 * 
	 * @param publicKeyString
	 * @param text
	 * @return
	 */
	public static String en(String publicKeyString, String text) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKeyString));
			byte[] enBytes = cipher.doFinal(text.getBytes());
			return (new BASE64Encoder()).encode(enBytes);
			// return Base64.encodeToString(enBytes,base64flag);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String encryptByFile(String publicKeystore, String plainText) {
		try {
			FileReader fr = new FileReader(publicKeystore);
			BufferedReader br = new BufferedReader(fr);
			String publicKeyString = "";
			String str;
			while ((str = br.readLine()) != null) {
				publicKeyString += str;
			}
			br.close();
			fr.close();
			cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKeyString));
			byte[] enBytes = cipher.doFinal(plainText.getBytes());
			return (new BASE64Encoder()).encode(enBytes);
			// return Base64.encodeToString(enBytes,base64flag);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String en(String text) {
		return encrypt(text, pubKey);
	}

	public static String encrypt(String plainText, String publicKeyString) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKeyString));
			byte[] enBytes = cipher.doFinal(plainText.getBytes());
			return (new BASE64Encoder()).encode(enBytes);
			// return Base64.encodeToString(enBytes,base64flag);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 使用私钥对明文密文进行解密
	 * 
	 * @param privateKey
	 * @param enStr
	 * @return
	 */
	public static String decrypt(PrivateKey privateKey, String enStr) {
		try {
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] deBytes = cipher.doFinal((new BASE64Decoder())
					.decodeBuffer(enStr));
			// byte[] deBytes = cipher.doFinal(Base64.decode(enStr,base64flag));
			return new String(deBytes);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 使用keystore对密文进行解密
	 * 
	 * @param privateKeystore
	 *            私钥路径
	 * @param enStr
	 *            密文
	 * @return
	 */
	public static String decryptByFile(String privateKeystore, String enStr) {
		try {
			FileReader fr = new FileReader(privateKeystore);
			BufferedReader br = new BufferedReader(fr);
			String privateKeyString = "";
			String str;
			while ((str = br.readLine()) != null) {
				privateKeyString += str;
			}
			br.close();
			fr.close();
			cipher.init(Cipher.DECRYPT_MODE, getPrivateKey(privateKeyString));
			byte[] deBytes = cipher.doFinal((new BASE64Decoder())
					.decodeBuffer(enStr));
			// byte[] deBytes = cipher.doFinal(Base64.decode(enStr,base64flag));
			return new String(deBytes);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * 
	 * @param privateKeyString
	 * @param enStr
	 * @return
	 */
	public static String de(String privateKeyString, String enStr) {
		try {
			cipher.init(Cipher.DECRYPT_MODE, getPrivateKey(privateKeyString));
			byte[] deBytes = cipher.doFinal((new BASE64Decoder())
					.decodeBuffer(enStr));
			// byte[] deBytes = cipher.doFinal(Base64.decode(enStr,base64flag));
			return new String(deBytes);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decrypt(String privateKeyString, String enStr) {
		try {
			cipher.init(Cipher.DECRYPT_MODE, getPrivateKey(privateKeyString));
			byte[] deBytes = cipher.doFinal((new BASE64Decoder())
					.decodeBuffer(enStr));
			// byte[] deBytes = cipher.doFinal(Base64.decode(enStr,base64flag));
			return new String(deBytes);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * public static void main(String[] args) { //
	 * RSAUtil.generateKeyPair("/Users/fangzhen"); String publicKey =
	 * "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCe7ylt5je2WZu2NvFcNuMeZcToZTCjAXPnEEEW\n"
	 * +
	 * "mYrX+LTnvIStMFMdtXFVQQR6G7xH2htTLYOwD7S/4X3r5F74l/QqNO9pqUfu96bSxsPHq7PVEflx\n"
	 * + "ZqQ7sePZN3ccu7VkwdGGy7eKkMbzjWk83xZ2ZlkY0b/nt7br4PrF4WamGwIDAQAB";
	 * String privateKey =
	 * "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAJ7vKW3mN7ZZm7Y28Vw24x5lxOhl\n"
	 * +
	 * "MKMBc+cQQRaZitf4tOe8hK0wUx21cVVBBHobvEfaG1Mtg7APtL/hfevkXviX9Co072mpR+73ptLG\n"
	 * +
	 * "w8ers9UR+XFmpDux49k3dxy7tWTB0YbLt4qQxvONaTzfFnZmWRjRv+e3tuvg+sXhZqYbAgMBAAEC\n"
	 * +
	 * "gYAoGgBCEoyMHiAD4ekUc2TrDpKYcK/M8VjlPFyv7x3xUHeU4SQ47rCKFnX6JOWUSds/5fBvFFTd\n"
	 * +
	 * "35ijsamsE3tCp1Na9Z7zb6LDX9HTTDRBMXE9wwnzkRjtxwPrxZA+8XqvI3CPQSjRvnzIVpYEGxvJ\n"
	 * +
	 * "ItaMfQjnaal6yXk11PAnwQJBAOtcaZ5MZQWp8BVTgndCouI/JlZPAh01GKE8AA4pjQmCeh3U+Cm5\n"
	 * +
	 * "fg0vnNAOzu3hZti01LZmGQQAYx5Z/oeCKPcCQQCs3w4aoeMY7pN3HSR/cRVXWfFsKGmqlmpHvjjg\n"
	 * +
	 * "C3qdXeIft+bpdAivdQzfUFsZdeSZKijN3EcLoideH30xbKb9AkEAsShET+UM/XBmyIatY3uDA22p\n"
	 * +
	 * "O7oIy1dWDLcPC5n3ETtnE+FkUnPPD7nQ/ULIO4I4WdHzcr/zAHISKZxv3Cv7DQJBAIs4qHcyYV62\n"
	 * +
	 * "5PRM+BPa0sEiopfkhBTqRnW48L0fAYSzE2VQChuBY21K6y793CBJHe1sUqhX+q+Xy/S1j3G6e1EC\n"
	 * +
	 * "QQDc3cDsTFg2QUmH7Re1YE8mZu6FlGwFmdDuFJSc1ocsrjmV8Uf9BNcDe8RxsAsuS9fbaaTpresJ\n"
	 * + "8T2z9cHoE4yf"; // String encrypt =
	 * RsaUtils.encryptByFile("/Users/fangzhen/publicKey.keystore",
	 * "123456789"); // String decrypt =
	 * RsaUtils.decryptByFile("/Users/fangzhen/privateKey.keystore", encrypt);
	 * String encrypt = RsaJava.en(publicKey, "123"); // String encrypt=
	 * "E6TbjuwLjVu1A1rhBBu6L0KEI1c127ttIGtMgvA22YGbdKUp+dulMkEfLRdOEGv1F3vJMdLNQt+38mwJd6DcI34DaZQeAmBKT5x221E5qMfR9NKC/BL0a6pw21S6s1mdnNUFNbOI2pPljzlpy2CSRBvFhg3E+fp7CDFxwfRMY78=\n"
	 * ; String decrypt = RsaJava.de(privateKey, encrypt);
	 * 
	 * String par1 =
	 * "Hg0yVSdU6HSN9rFhenWmWZXuO93Ga5IhwY4KcRr7VJZuTGN/jrdMaQE3YaU2dsK45Dc7uGd9SBBI3cezYIJ6HyF4/rP1uYBy5e5jR6Ow5X80wXEKJE+FDcqK4Kzvy6K2g+Da0WKQRrWOrPDQPUgq9pf5HQtiNf2psIFzkRPw5zw="
	 * ; String par2 =
	 * "JWDaygPcYbvLA6HZ0CQfHa0mPJGD/JNkw74CIqWvj2cXKkgxSUAT0pJeFr3Ptq6VArZz9mtAVcGzNb/VTha0VoiUXhF+TV7LA4Ih8GkWb1nU5znWWCeKdqtdzFzu5Byd5+W3fWwFU/7UUqE7DWOSiHhYZQieokHAQK2PURyjFVQ="
	 * ;
	 * 
	 * String decrypt2 = RsaJava.de(privateKey, par2);
	 * System.out.println(decrypt2); // System.out.println("加密后:"+encrypt); //
	 * System.out.println("解密后:"+decrypt); //
	 * System.out.println("加密后:"+RsaUtils.encrypt("fangzhen", publicKey)); }
	 */
}
