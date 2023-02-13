// 1268. Search Suggestions System

package dmpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        String[] list = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
        System.out.println(simpleSearch(list,"mouse"));
        System.out.println(optimizedSearch(list,"mouse"));
    }

    public static List<List<String>> simpleSearch(String[] products, String searchWord) {
        List<List<String>> resultList = new ArrayList<>();
        List<String> list = Arrays.asList(products);
        list = list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < searchWord.length(); i++) {
            String newStr = searchWord.substring(0,i+1);
            List<String> newList = list.stream()
                    .filter(s1 -> s1.contains(newStr))
                    .limit(3)
                    .collect(Collectors.toList());
            resultList.add(newList);
        }
        return resultList;
    }

    public static List<List<String>> optimizedSearch(String[] products, String searchWord) {
        List<List<String>> resultList = new ArrayList<>();
        Arrays.sort(products);
        for (int i = 0; i < searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i + 1);
            List<String> suggestions = new ArrayList<>();
            for (String product : products) {
                if (suggestions.size() >= 3) break;
                if (product.startsWith(prefix))
                    suggestions.add(product);
            }
            resultList.add(suggestions);
        }
        return resultList;
    }
}

/*
Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
*/
