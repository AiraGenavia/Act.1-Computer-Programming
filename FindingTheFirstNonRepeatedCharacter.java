package AiraGenavia;

public class FindingTheFirstNonRepeatedCharacter {

  public static void main(String[] args) {


  String inputStr = " tables tablet";
  for(char i : inputStr. toCharArray()) {
    if(inputStr.indexOf(i) == inputStr. lastIndexOf(i)) {
      
      System.out.println("First non repeated character is; " +i);
      
    }
  }
  

  }

}

