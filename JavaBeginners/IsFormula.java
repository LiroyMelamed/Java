import java.util.ArrayList;

class IsFormula {

 public static boolean isFormula(String s) {
  int[] freq = new int[2];
  String S = s;
  boolean F = true;
  for (int i = 0; i < (s.length()); i++) {
   if (S.charAt(i) == '(')
    freq[0]++;
   if (S.charAt(i) == ')')
    freq[1]++;
   if (S.charAt(i) == '*' || S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '/') {
    if (S.charAt(i--) == '*' || S.charAt(i--) == '+' || S.charAt(i--) == '-' || S.charAt(i--) == '/') {
      F = false;
    }
   }
  }
  if (freq[0] != freq[1])
   F = false;
  return F;
 }

 public static double assign(String s, int x) {
  if (!isFormula(s))
   throw new Error("Not a Formula");
  char a = (char) x;
  for (int i = 0; i < (s.length()); i++) {
   if (s.charAt(i) == 'x')
    s.replace('x', a);
  }
  System.out.println(s);
  int len = s.length();
  ArrayList list1 = new ArrayList();
  ArrayList list2 = new ArrayList();
  for (int i = 0; i < len; i++) {
   if ((s.charAt(i) != '+') && (s.charAt(i) != '-')) {
    // check if the number is double-digit
    if ((i + 1 <= len - 1)) {
     if ((s.charAt(i + 1) != '+') && (s.charAt(i + 1) != '-')) {
      String temp = "";
      temp = temp + s.charAt(i) + s.charAt(i + 1);
      int tempToInt = Integer.parseInt(temp);
      // adding the double digit number
      list1.add(tempToInt);
     }
     // add single digit number
     list1.add(s.charAt(i) - '0');
    }
   } else {
    // adding the symbols
    list2.add(s.charAt(i));
   }
  }
  int result = 0;
  result = result + (int) list1.get(0);
  for (int t = 0; t < list2.size(); t++) {
   char oper = (char) list2.get(t);
   if (oper == '+') {
    result = result + (int) list1.get(t + 1);

   } else if (oper == '-') {
    result = result - (int) list1.get(t + 1);
   }
  }
  return result;

 }

 public static void main(String[] args) {
  String s = "((x+5)*(x-5))";
  System.out.println(isFormula(s));
  System.out.println(assign(s, 2));
 }

}
