
class HexToDecToHex{

 public static int Hex2Dec(String hex){
  String digits = "0123456789ABCDEF";
  hex = hex.toUpperCase();
  int sum = 0;
  for (int i = 0; i < hex.length(); i++) {
   char c = hex.charAt(i);
   int d = digits.indexOf(c);
   sum = 16*sum + d;
  }
  return sum;
 }

 public static String Dec2Hex(int num){
  String digits = "0123456789ABCDEF";
  if (num == 0) return "0";
  int base = 16;
  String hex = "";
  while (num > 0) {
   int digit = num % base;
   hex = digits.charAt(digit) + hex;
   num = num / base;
  }
  return hex;
 }

 public static void main(String[] args) {
  int n = 10;
  String s = "a";
  System.out.println(Dec2Hex(n));
  System.out.println(Hex2Dec(s));
 }
}