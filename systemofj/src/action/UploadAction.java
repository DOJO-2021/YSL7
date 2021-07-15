package action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

public class UploadAction {

		public String upload(HttpServletRequest request) {

			//戻り値に設定するページを初期設定しておく
			String page = "/WEB-INF/jsp/result.jsp";

			try {
				File csv = new File("csv");
				BufferedReader br = new BufferedReader(new FileReader(csv));

				String line;

				while ((line = br.readLine()) != null) {
					String[] data = line.split(",");
				}

				br.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return page;
	}
}
