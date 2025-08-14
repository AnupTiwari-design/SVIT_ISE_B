package Tree;

public class Trie {
	
	
	    private TrieNode root;

	    public Trie() {
	        root = new TrieNode();
	    }

	    // Insert a word
	    public void insert(String word) {
	        TrieNode current = root;
	        for (char ch : word.toCharArray()) {
	            int index = ch - 'a';
	            if (current.children[index] == null)
	                current.children[index] = new TrieNode();
	            current = current.children[index];
	        }
	        current.isEndOfWord = true;
	    }

	    // Search for exact word
	    public boolean search(String word) {
	        TrieNode current = root;
	        for (char ch : word.toCharArray()) {
	            int index = ch - 'a';
	            if (current.children[index] == null)
	                return false;
	            current = current.children[index];
	        }
	        return current.isEndOfWord;
	    }

	    // Check if any word starts with given prefix
	    public boolean startsWith(String prefix) {
	        TrieNode current = root;
	        for (char ch : prefix.toCharArray()) {
	            int index = ch - 'a';
	            if (current.children[index] == null)
	                return false;
	            current = current.children[index];
	        }
	        return true;
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        Trie trie = new Trie();

	        trie.insert("apple");
	        trie.insert("app");
	        trie.insert("bat");

	        System.out.println("Search 'app': " + trie.search("app"));      // true
	        System.out.println("Search 'apple': " + trie.search("apple"));  // true
	        System.out.println("Search 'ap': " + trie.search("ap"));        // false
	        System.out.println("StartsWith 'ap': " + trie.startsWith("ap")); // true
	        System.out.println("StartsWith 'ba': " + trie.startsWith("ba")); // true
	        System.out.println("Search 'bat': " + trie.search("bat"));       // true
	    }
	}
