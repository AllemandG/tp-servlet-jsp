package tp.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {
	public static void logParameters(HttpServletRequest req) {
		System.out.println("Liste des params : ");
		Map<String, String[]> matrice = req.getParameterMap();
		
		Set<String> keys = matrice.keySet();
		
		for (String k : keys) {
			System.out.println(k + " " + Arrays.toString(matrice.get(k)));
		}
	}
}
