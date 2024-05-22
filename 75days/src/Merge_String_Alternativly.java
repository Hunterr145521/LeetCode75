public class Merge_String_Alternativly {

    public static void main(String args[]){
        System.out.println(Merge_String_Alternativly.mergeAlternately("ABC","DEF"));
        System.out.println(Merge_String_Alternativly.mergeAlternately2("ABC","DEF"));
    }

    //Init Approach - Here we have created 2 vairables
        // * first with String to store the result String
        // * second with int to store the max length between both of the words.
        // * Then First done a check with if which length word length is bigger and storing them in variable of int
        // * Iterating over for loop for length number of times(stored in int variable)
        // * Then added a if statement for both of the word chars that if the index i from for loop is less than(<) the word length then add that char in string result(concat)
        // * Iterate till the max end.
        // * return the string variable with result value.
    public static String mergeAlternately(String word1, String word2) {
        String temp = "";
        int length = 0;
        if(word1.length() > word2.length()){
           length = word1.length();
        }else{
           length = word2.length();
        }
        for(int i=0;i<length;i++){
           if(i < word1.length()){
               temp += word1.charAt(i);   
           }
           if(i < word2.length()){
               temp += word2.charAt(i);   
           }
        }
   
        return temp;
       }

    //Faster Approach - Here we have created 3 variables
    // * frist with StringBuilder to store the result string
    // * second and third with 2 integer to store the iteration value (init with 0 value)
    // * first set the value of both integer at 0 and declare the StringBuilder
    // * then createa while loop and put the condition and first int length should be less then word1 length(first < word1.length()) and similerly for second int length should be less then word2 length(second < word2.length())
    // * the above while condition should be in or seperation(||)
    // * Then added a if statement for both of the word chars that if the index i from for loop is less than(<) the word length then add that char in string result(concat)
    // * Iterate till the max end.
    // * return the string variable with result value.

    public static String mergeAlternately2(String word1, String word2) {
        StringBuilder temp  = new StringBuilder();
        int first = 0, second = 0;
        while(first < word1.length() ||  second < word2.length()){
            if(first < word1.length()){
                temp.append(word1.charAt(first));
            }
            if(second < word2.length()){
                temp.append(word2.charAt(second));
            }
            first++;second++;
        }
        return temp.toString();
    }


    
    
}
