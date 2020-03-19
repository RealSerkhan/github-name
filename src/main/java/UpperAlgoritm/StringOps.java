package UpperAlgoritm;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.asciitable.com/index/asciifull.gif
 * https://cdn.cs50.net/2016/x/psets/0/pset0/bulbs.html
 * http://sticksandstones.kstrom.com/appen.html
 */
public class StringOps {

  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
 public String invertCase(String origin) {
//   List<Character>chars=new ArrayList<>();

  return null;}

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC
  public String toUpperCase(String origin) { // a -> A A -> A

    String result = "";
    char ch = ' ';
    for (int i = 0; i < origin.length(); i++) {

      if (origin.charAt(i) >= 'a' && origin.charAt(i) <= 'z') {
        ch = (char)(origin.charAt(i) - 32);
      }
      else {
        ch = (char)(origin.charAt(i));
      }

      result += ch;
    }
    return result;
  }



  public String toLowerCase(String origin) { // A -> a a -> a

    StringBuilder ns=new StringBuilder();
    for (int i = 0; i< origin.length(); i++){

      char aChar = origin.charAt(i);
      if (65 <= aChar && aChar<=90){
        aChar = (char)( (aChar + 32) );
      }
      ns.append(aChar);


    }
    return ns.toString();
  }

}
