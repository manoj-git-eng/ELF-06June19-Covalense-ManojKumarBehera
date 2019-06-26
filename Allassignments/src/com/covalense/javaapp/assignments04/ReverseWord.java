package com.covalense.javaapp.assignments04;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
class Word {
	void wordRev(String[] s) {
		for (int j = 0; j <= s.length - 1; j++) {
			char[] ch = s[j].toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");

		}
	}
}

@Log
public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("Enter the sentence in which you want to reverse each word");
		String s = scan.nextLine();
		String[] str = s.split(" ");
		Word wr = new Word();
		wr.wordRev(str);

	}
}
