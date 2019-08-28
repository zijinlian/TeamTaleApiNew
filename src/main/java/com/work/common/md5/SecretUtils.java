package com.work.common.md5;

import java.io.UnsupportedEncodingException;

public class SecretUtils {
	 static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCe7ylt5je2WZu2NvFcNuMeZcToZTCjAXPnEEEW\n" +
             "mYrX+LTnvIStMFMdtXFVQQR6G7xH2htTLYOwD7S/4X3r5F74l/QqNO9pqUfu96bSxsPHq7PVEflx\n" +
             "ZqQ7sePZN3ccu7VkwdGGy7eKkMbzjWk83xZ2ZlkY0b/nt7br4PrF4WamGwIDAQAB";
     static String privateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAJ7vKW3mN7ZZm7Y28Vw24x5lxOhl\n" +
             "MKMBc+cQQRaZitf4tOe8hK0wUx21cVVBBHobvEfaG1Mtg7APtL/hfevkXviX9Co072mpR+73ptLG\n" +
             "w8ers9UR+XFmpDux49k3dxy7tWTB0YbLt4qQxvONaTzfFnZmWRjRv+e3tuvg+sXhZqYbAgMBAAEC\n" +
             "gYAoGgBCEoyMHiAD4ekUc2TrDpKYcK/M8VjlPFyv7x3xUHeU4SQ47rCKFnX6JOWUSds/5fBvFFTd\n" +
             "35ijsamsE3tCp1Na9Z7zb6LDX9HTTDRBMXE9wwnzkRjtxwPrxZA+8XqvI3CPQSjRvnzIVpYEGxvJ\n" +
             "ItaMfQjnaal6yXk11PAnwQJBAOtcaZ5MZQWp8BVTgndCouI/JlZPAh01GKE8AA4pjQmCeh3U+Cm5\n" +
             "fg0vnNAOzu3hZti01LZmGQQAYx5Z/oeCKPcCQQCs3w4aoeMY7pN3HSR/cRVXWfFsKGmqlmpHvjjg\n" +
             "C3qdXeIft+bpdAivdQzfUFsZdeSZKijN3EcLoideH30xbKb9AkEAsShET+UM/XBmyIatY3uDA22p\n" +
             "O7oIy1dWDLcPC5n3ETtnE+FkUnPPD7nQ/ULIO4I4WdHzcr/zAHISKZxv3Cv7DQJBAIs4qHcyYV62\n" +
             "5PRM+BPa0sEiopfkhBTqRnW48L0fAYSzE2VQChuBY21K6y793CBJHe1sUqhX+q+Xy/S1j3G6e1EC\n" +
             "QQDc3cDsTFg2QUmH7Re1YE8mZu6FlGwFmdDuFJSc1ocsrjmV8Uf9BNcDe8RxsAsuS9fbaaTpresJ\n" +
             "8T2z9cHoE4yf";
	/**
	 * 解密
	 * @param par
	 * @return
	 */
	public static String deParameterByRSA(String par){
		if(StringTool.isNotEmpty(par)){
			try {
				return java.net.URLDecoder.decode((RsaJava.de(privateKey, par)),"UTF-8") ;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return par;
			}
		}else{
			return par;
		}
	};
	
	/**
	 * 加密
	 * @param par
	 * @return
	 * @throws Exception
	 */
	public static String enParameterByDES(String par) {
		try {
			return DESUtil.encryptDES(par, "$&Au&781");
		} catch (Exception e) {
			System.out.println("加密失败");
			e.printStackTrace();
		}
		return par;
	}
	/**
	 * 解密DES
	 * @param par
	 * @return
	 */
	public static String deParameterByDES(String par){
		try {
			return DESUtil.decryptDES(par, "$&Au&781");
		}catch (Exception e) {
			System.out.println("解密DES");
			e.printStackTrace();
		}
		return par;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(enParameterByDES("{\"fdBlCreateid\":\"6972613\",\"fdTypeId\":\"ff8080815a659ac8015a6a0dba450385\",\"page\":1,\"pageSize\":10}"));
		//System.out.println(DESUtil.decryptDES("dM/pcmyBHys+CBYG42atLJ01f29Co9t+", "$&Au&781"));
		String s = "oQ9LJ87nFh4NarppbtUlfAdhHTg5GNk77Nbg78na5xnLIbg2+6A9orRVJa+T nBKKcQGhkv7g4qZ7SswftDzUAKGGJoECvyLneAAXbSUb6FUCXKDBXmoyGeK8 GPWD8eZwAxDULrV7ATcWrMzpc8vceqTfbOv7X47qTOdBto6nlNVRotqftSz6 qtB5Bg09gxgod9pmabnKn8HOAw0bDszET3Zrrqa9ie9vo4UKjVaxCDhTHjD7 Dq1tx19y8lzvLnfjTVmeGYD4s6VAbLiHEG3x03WgPcnHmQEX9bhSgJZjJQ1s yCXFW4NfuwVjM9KJ8NoRXexTUttf1GleFKDN0/MWhEnZ3C+Piwzv9jjoLQRC +SgTJaz0illJYtM5QIrKMKX9HHgZRa7y3vWTENu1EjnvVHGx1+y9vwk56R1X 7FfzaYQkQ6m53iY94pxswKlkMwIXxqZxdzHHTC8jSm/u4pQbsVOaDSEpSpRX eUt7CN/GGp6CQ7xkJs42hkYkIZEP5I+qieYLRG57R2ZRALRu6LHmYMBiAkMw PAQh/TR5IeLJhQAssoV3o3oajQ2KlfXIwS00X1znrlYuZH33n6H9NY85kNTi MMoWOOSMTBal5v8BzYznLbe+YBAZKiy+uSULtH7lIJVjPeXe3zoZg7e1gYB5 gSQXCOwSBDCb0NQ49bkAUb89loP5GrP2kdfHxCgxwYs9uTdQkrsIekm4da12 DjqaCg2/Ik/OqQHlJgDAIgbyqlBrHvnuTzUvbtjwvx2zSn4qkLgoecKC5WpR TVyR3igTm70QRa0+GjY3mIHpGYhXpvgIfJTz7a8t+ILrc3wW1f6BBQ++Tjey 3mCgpiyQEgf13GMaJ4YY3fL7kNQISDZyWX8jA6qkA+Zi2agCprgb3+iKN9Co mYmqGNZkuEcfGM73VXlqChohMipFHda+V4UZR/UnwQPTUQntcJfQzrMkvdar W0jhhi6B9tMFe4gIgm+1+i2YeYH4kT2q983N8ZLAlQ9Ytzf825FEjV/Ua1Nz N1nlq/k5ePdzYSYEjjm/9k97QumsWFpYqgqnL/KzTC5XleoO0NCq7O/cnkwW peb/Ac2MXRLohj3KWRbMUyE7UtMGcBSIL0Cv1OgTw9lOEMTyLXg/qz8kuMGY zCRQ+Y3umQYY2vxp71+AZlI4WaXtQo3N6qMzb4SxlMewO3rFylcqMzuWAV5X OSSGiCtDB3h9Exw2blZVFTUdAVUSiYz0CZyJ8uHM9Uj7Y5//wFh93lpad1Cb Ym7l/6YRzg==";
		System.out.println(deParameterByDES(s));
	}
}
