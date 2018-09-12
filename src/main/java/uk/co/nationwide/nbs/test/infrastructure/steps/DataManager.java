/**
 * 
 */
package uk.co.nationwide.nbs.test.infrastructure.steps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

/**
 * @author thomas.graham
 *
 */
public class DataManager {

    public static <T> T getData(String path, String dataGroup, Class<T> clazz) throws IOException {
	String filePath = path + dataGroup + ".json";
	Gson gson = new Gson();
	File file = new File(filePath);
	BufferedReader br = null;
	try {
	    br = new BufferedReader(new FileReader(file));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	return gson.fromJson(br, clazz);

    }

}
