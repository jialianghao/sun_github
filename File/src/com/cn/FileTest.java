package com.cn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
	
	public static void main(String[] args) {
		List<String> resultFileName=new ArrayList<String>();
		File file=new File("C:\\Users\\sunjialiang\\Desktop\\platform-data-access-consumer");
		List<String> ergodic = ergodic(file,resultFileName);
		for (String string : ergodic) {
			System.out.println(string);
		}
	}
	
	 private static List<String> ergodic(File file,List<String> resultFileName){
	        File[] files = file.listFiles();
	        if(files==null)return resultFileName;// 判断目录下是不是空的
	        for (File f : files) {
	            if(f.isDirectory()){// 判断是否文件夹
	                resultFileName.add(f.getPath());
	                ergodic(f,resultFileName);// 调用自身,查找子目录
	            }else
	                resultFileName.add(f.getPath());
	        }
	        return resultFileName;
	    }

}
