package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.annotation.PostConstruct;

public class SConnection {
	public static String post(String param){
		
		String result="";
		
		try {
			
			URL url=new URL(system.Config.ServerURL);
			URLConnection connection=url.openConnection();
			connection.setReadTimeout(5000);
			connection.setConnectTimeout(5000);
			connection.setDoOutput(true);
			connection.setDoInput(true);
			try(PrintWriter out=new PrintWriter(connection.getOutputStream())){
				out.print(param);
				out.flush();
			}
			try(BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))){
				String line;
				while ((line=in.readLine())!=null)
					result+=line;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return result;
	}
}
class Result{
	int resultType;
	Map result;
}