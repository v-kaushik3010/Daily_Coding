// Last updated: 9/22/2026, 2:56:57 PM
import java.util.*;

class Solution {

    class Trie {
        class Node {
            Node[] child = new Node[26];
            String word;   // stores root word when terminal
        }

        Node root = new Node();

        void insert(String s) {
            Node curr = root;
            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                if (curr.child[idx] == null)
                    curr.child[idx] = new Node();
                curr = curr.child[idx];
            }
            curr.word = s;
        }

        String search(String s) {
            Node curr = root;
            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                if (curr.child[idx] == null)
                    return s;

                curr = curr.child[idx];

                if (curr.word != null)
                    return curr.word;
            }
            return s;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {

        Trie trie = new Trie();

        for (String root : dictionary)
            trie.insert(root);

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(trie.search(w)).append(" ");
        }

        return sb.toString().trim();
    }
}
