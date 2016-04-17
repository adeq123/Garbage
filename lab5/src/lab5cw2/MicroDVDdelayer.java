package lab5cw2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MicroDVDdelayer {
	
	public static void microDVDdelayer(String inputFilePath,String outputFilePath ,int delay, int fps) throws IOException, WrongDataException{
		
	String oneLine;
	File inputFile = new File(inputFilePath);
	File outputFile = new File(outputFilePath);
	
	
	BufferedReader readFile = new BufferedReader (new FileReader(inputFile.getAbsolutePath()));
	Writer writeFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile.getAbsolutePath()),"utf-8"));
	
	while((oneLine = readFile.readLine()) != null){
		
		writeFile.write(delaySubs(delay, fps, oneLine));
		
	}
	readFile.close();
	writeFile.close();
	}
	
	public static String delaySubs(int delay, int fps, String oneLine) throws WrongDataException{
		
		String line [] = oneLine.split("}");
		
		String startTime = line[0];
		String endTime = line[1];
		String subtitle = line[2];	
		
		startTime = startTime.substring(1);
		endTime = endTime.substring(1);
		
		Pattern regex = Pattern.compile("([0-9]*){2}");
		Matcher m = regex.matcher("startTime + endTime");
		
		if(m.matches()){
		int startTimeNumber = Integer.parseInt(startTime);
		int endTimeNumber = Integer.parseInt(endTime);
		
		if(startTimeNumber > endTimeNumber)
			throw new WrongDataException ("huj w oko eksepszyn");
		
		startTimeNumber += fps*delay/1000;
		endTimeNumber += fps*delay/1000;
		return "{"+Integer.toString(startTimeNumber)+"}"+"{"+Integer.toString(endTimeNumber)+"}"+subtitle+"\\";
		
		}else
			throw new WrongDataException ("Wyjatek. Niepoprawne dane wejsciowe w lini: "+Thread.currentThread().getStackTrace()[1].getLineNumber());
	}
}
