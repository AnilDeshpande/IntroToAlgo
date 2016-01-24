package com.algorithm.insertionsort;

public class SortAlgorithams {

	public static void insertionSort(int [] array) {
		/*int forLoopCounter=0;
		int whileLoopCounter=0;*/
		for(int j=1; j<array.length;j++){
			//forLoopCounter++;
			int key=array[j];
			int i=j-1;
			while(i>=0 && array[i]>key){
				array[i+1]=array[i];
				i=i-1;
				array[i+1]=key;
				//whileLoopCounter++;
			}
		}
		
		/*System.out.println("For : "+forLoopCounter+" while: "+whileLoopCounter);
		System.out.println("Total Loops: "+(forLoopCounter*whileLoopCounter));*/
	}
	
	public static void main(String[] args) {
		int [] array=new int []{4,3,2,1};
		System.out.println("Unsorted: "+printArray(array));
		insertionSort(array);
		System.out.println("Sorted: "+printArray(array));
	}
	
	private static String printArray(int [] array){
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<array.length;i++){
			builder.append(array[i]+"\t");
		}
		
		return builder.toString();
	}
	
}
