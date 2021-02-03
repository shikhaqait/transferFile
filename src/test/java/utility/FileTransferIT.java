package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 * The File name should ends with IT otherwise code will not work
 * @author TJ
 *
 */
public class FileTransferIT {

	@Test
	public void tansferFile() {
		// instead of // or / use the File.separater for all paths
		String sourceDirectoryPath = System.getProperty("user.dir") + File.separator + "target";
		String targetDirectoryPath = System.getProperty("user.dir");
		transferDirectory(sourceDirectoryPath,targetDirectoryPath);
	}

	public void transferDirectory(String sourceDirectoryPath, String destinationDirectoryPath) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd_hh_mm_ss_a");
		Date date = new Date();
		String date_time = dateFormat.format(date);
		File destinationDirectory = new File(destinationDirectoryPath + File.separator + "Results_" + date_time);
		boolean exists = destinationDirectory.exists();
		if (!exists) {
			destinationDirectory.mkdir();
		}
		System.out.println("Save Image File Path :");
		File sourceDir = new File(sourceDirectoryPath);
		try {
			FileUtils.copyDirectory(sourceDir, destinationDirectory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
