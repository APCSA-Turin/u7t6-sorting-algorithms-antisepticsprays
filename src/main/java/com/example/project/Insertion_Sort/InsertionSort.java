package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static int insertLoopCounter = 0;

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int counter = 0;
        for (int i = 1; i < elements.length; i++) {
            int sortedIndex = i;
            int swapIndex = i - 1;
            while (swapIndex >= 0 && elements[sortedIndex] < elements[swapIndex]) {
                //swaps
                int temp = elements[sortedIndex];
                elements[sortedIndex] = elements[swapIndex];
                elements[swapIndex] = temp;
                sortedIndex--;
                swapIndex--;
                counter++;
            }
        }
        System.out.print("INSERTION SORT: Number of loop iterations: " + counter);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int counter = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int currentMin = i;
            for (int j = i + 1; j < elements.length ; j++) {
                counter++;
                if (elements[j] < elements[currentMin]) {
                    currentMin = j;
                }
            }
            if (currentMin != i) {
                //swap values
                int temp = elements[i];
                elements[i] = elements[currentMin];
                elements[currentMin] = temp;
            }
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + counter);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int counter = 0;
        for (int i = 1; i < words.size(); i++) {
            int sortedIndex = i;
            int swapIndex = i - 1;
            while (swapIndex >= 0 && words.get(sortedIndex).compareTo(words.get(swapIndex)) < 0) {
                //swaps
                String temp = words.get(sortedIndex);
                words.set(sortedIndex, words.get(swapIndex));
                words.set(swapIndex, temp);
                sortedIndex--;
                swapIndex--;
                counter++;
            }
        }
        System.out.print("INSERTION SORT: Number of loop iterations: " + counter);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int counter = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            int currentMin = i;
            for (int j = i + 1; j < words.size() ; j++) {
                counter++;
                if (words.get(j).compareTo(words.get(currentMin)) < 0) {
                    currentMin = j;
                }
            }
            if (currentMin != i) {
                //swap values
                String temp = words.get(i);
                words.set(i, words.get(currentMin));
                words.set(currentMin, temp);
            }
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + counter);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}