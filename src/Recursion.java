public class Recursion {

    public static class KeypadCombination{
        String[] keypad = {"0","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        public void printComb(String  str,int idx,String combntion){
            if(idx==str.length()){
                System.out.println(combntion);
                return;
            }

            char currChar = str.charAt(idx);
            String  mapping= keypad[currChar-'0'];
            for (int i=0;i<mapping.length();i++){
                printComb(str,idx+1,combntion+mapping.charAt(i));
            }

        }
    }
    public static void main(String[] args) {

        String str = "23";
        KeypadCombination kc1 =new KeypadCombination();
        kc1.printComb(str,0,"");

    }
}
