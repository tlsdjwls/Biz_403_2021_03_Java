package com.callor.score.sevice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV1 implements WordService  {
      
	protected List<WordVO>wordList;
	public WordServiceImplV1() {
		// TODO Auto-generated constructor stub
		wordList = new ArrayList<WordVO>();
		
		
	}
	@Override
	public void loadWord() {
		// TODO Auto-generated method stub
		String fileName = "src/com/callor/score/word.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String wordFile = null;
		try {
			fileReader = new FileReader(wordFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buffer = new BufferedReader(fileReader);
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		// TODO wordList 에 담긴 데이터중 임의 데이터 1개를 추출 해서 가져오는것
		Random rnd = new Random();
		rnd.nextInt(100);
		
		int nSize = wordList.size();
		int num = rnd.nextInt(nSize);
		
		WordVO woVO = wordList.get(num);
		System.out.println();
	}

	
}
