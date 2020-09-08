
package Model.DAO;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static org.apache.tomcat.util.security.ConcurrentMessageDigest.digest;
import static org.apache.tomcat.util.security.ConcurrentMessageDigest.digest;



public class Hash {
    
    public static String  MakeHash(String pasString) throws NoSuchAlgorithmException {
	MessageDigest digest = MessageDigest.getInstance("SHA-256");
	byte[] encodedhash = digest.digest(pasString.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    }

    public static String bytesToHex(byte[] hash) {
	    StringBuffer hexString = new StringBuffer();
	    for (int i = 0; i < hash.length; i++) {
	    String hex = Integer.toHexString(0xff & hash[i]);
	    if(hex.length() == 1) hexString.append('0');
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}
}

