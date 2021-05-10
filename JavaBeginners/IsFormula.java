
class IsFormula {

 public static boolean isFormula(String s){
  int [] freq = new int [2];
  String S = s;
  for(int i=0; i< (s.length()) ; i++){
   if(S.charAt(i) == '(') freq[0]++;
   if(S.charAt(i) == ')') freq[1]++;
  }
  if(freq[0]==freq[1]) return true;
  else return false;
 }

 public static void main(String[] args) {
  String s = "(x+5(x/3+x+3)+x+2))";
  System.out.println(isFormula(s));  
 }
 
}
