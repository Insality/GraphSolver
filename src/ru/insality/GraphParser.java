package ru.insality;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ru.insality.Graph.type;

/** ��������� ���� � ������ ���� � ������ ������������� */
public class GraphParser {

	public static Graph parseGraph(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);

		// ������ ������������� �� �����:
		String nextLine = sc.nextLine().trim();
		type state;
		try {
			state = type.valueOf(nextLine);
		} catch (IllegalArgumentException e) {
			System.out
					.println("Error in parsing first string: check graph's present");
			e.printStackTrace();
			sc.close();
			return null;
		}
		System.out.println(state);

		sc.close();
		return null;
	}
}