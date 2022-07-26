//Name: Hemza Al-Shamari
//Class: CSS211
//Date: 06/09/22
//Instructor: Craig Niiyama


import java.io.*;
import java.util.*;

public class HuffmanNode implements Comparable<HuffmanNode> {

    public int frequency;
    public char character;
    public HuffmanNode left;
    public HuffmanNode right;

    // TODO: node constructors
    // constructor for parent node
    public HuffmanNode(int frequency) {
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    // constructor for leaf node
    public HuffmanNode(int frequency, char character) {
        this.frequency = frequency;
        this.character = character;
        this.left = null;
        this.right = null;
    }

    // TODO: construct method that returns node == leaf
    // return true is node is leaf (has no children)
    boolean isLeaf() {
        return left == null && right == null;
    }

    // TODO: static method that provides count of characters in input file
    public static Map<Character, Integer> getCounts(FileInputStream input) throws IOException {

        Map<Character, Integer> map = new TreeMap<>();

        byte[] fileData = new byte[10000]; // new byte list

        input.read(fileData); // read bytes to fileData

        String reader = new String(fileData);

        int n = 0;
        char current = reader.charAt(n); //read current char at index[n]

        while (current != '\u0000') { // not equal to default value
            if (map.containsKey(current)) {
                int count = map.get(current);
                map.put(current, count+1); // update current count by 1
            } else {
                map.put(current, 1); // only one value of current char
            }
            n++; // next index
            current = reader.charAt(n);
        }
        return map;
    }

    @Override
    public int compareTo(HuffmanNode o) {
        return 0;
    }

}