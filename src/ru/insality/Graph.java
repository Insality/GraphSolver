package ru.insality;

import java.util.ArrayList;

public class Graph {

	/**
	 * ���� ������������� �����. ARR - ������, LIST - ������, INC(incidence) -
	 * �������������, ADJ(adjacency) - ���������
	 */
	static enum type {
		ARR_INC, ARR_ADJ, LIST_ADJ
	}

	private type state;
	public int[][] ARR_INC;
	public int[][] ARR_ADJ;
	public ArrayList<ArrayList<Integer>> LIST_INC = new ArrayList<ArrayList<Integer>>();

	public void printGraph(){
		// TODO: ������� �� ������� ���� � ���������� � ��
	}
	
	public type getState() {
		return state;
	}

	public void setState(type state) {

		// TODO: do a graph's present switch
		this.state = state;
	}
}
