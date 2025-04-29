public class StringPalindromeCheck {
   public static void main(String args[]){
      String name = "charishma";
      String reversedString = "";
      for(int i = name.length()-1; i >= 0; i--){
         reversedString += name.charAt(i);
      }
      System.out.println(reversedString);
   }
}
