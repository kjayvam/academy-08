package jdbc;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JDBC {
	public static void main(String[] args) {
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();

		enc.setPassword("javasw");
		System.out.println(enc.encrypt("oracle.jdbc.driver.OracleDriver"));
		System.out.println(enc.encrypt("jdbc:oracle:thin:@localhost:1521:xe"));
		System.out.println(enc.encrypt("scott")); // id
		System.out.println(enc.encrypt("tiger")); // pw
	}
}
