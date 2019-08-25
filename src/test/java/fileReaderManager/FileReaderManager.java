package fileReaderManager;

import dataProvider.ConfigFileReader;
import dataProvider.ExtenntReport;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager;
	private ConfigFileReader configFileReader;
	private ExtenntReport extenntReport;
	
	public static FileReaderManager getinstance(){
		return (fileReaderManager == null) ? fileReaderManager = new FileReaderManager(): fileReaderManager;
	}
	
	public ConfigFileReader getconfiginstance(){
		return (configFileReader == null) ? configFileReader = new ConfigFileReader(): configFileReader;		
	}
	
	public ExtenntReport getExtenntReportinstance(){
		return (extenntReport == null) ? extenntReport = new ExtenntReport(): extenntReport;		
	}


}
