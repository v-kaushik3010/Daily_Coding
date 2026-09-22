// Last updated: 9/22/2026, 2:59:11 PM
import java.util.*;

class Solution {

    class Trie {
        class Node {
            Node[] child = new Node[26];
            String word;   // store full word at terminal
        }

        Node root = new Node();

        void insert(String s) {
            Node curr = root;
            for(char c : s.toCharArray()) {
                int idx = c - 'a';
                if(curr.child[idx] == null)
                    curr.child[idx] = new Node();
                curr = curr.child[idx];
            }
            curr.word = s;
        }
    }

    List<String> result = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {

        Trie trie = new Trie();
        for(String w : words)
            trie.insert(w);

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, trie.root);
            }
        }

        return result;
    }

    void dfs(char[][] board, int i, int j, Trie.Node node) {

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return;

        char ch = board[i][j];

        if(ch == '#' || node.child[ch - 'a'] == null)
            return;

        node = node.child[ch - 'a'];

        if(node.word != null) {
            result.add(node.word);
            node.word = null; // avoid duplicates
        }

        board[i][j] = '#';   // mark visited

        dfs(board, i+1, j, node);
        dfs(board, i-1, j, node);
        dfs(board, i, j+1, node);
        dfs(board, i, j-1, node);

        board[i][j] = ch;    // restore
    }
}
