package linear_search.search_word;

public class SearchWord {

    public static String search(String arr[],String s){

        for(String str:arr) {

                if (str.contains(s)) return str;

        }
        return "Not found";
    }

    public static void main(String[] args) {
        String arr[]={"the black fox","in the forest found","something is ","shining in the deep dark forest"};

                String s=search(arr,"fox");
        System.out.println(s);

    }
}
