package sesiones.Ejercicosindividiales.Pilas;

import java.util.Stack;

public class Eje3 {
    public static void main(String[] args) {
        
        String paran = "(()()";
        System.out.println("Vamos a verificare si la sentecia " + paran + " esta balanceada.");

        Stack<Character> balance = new Stack<>();
        
        for (int i = 0; i < paran.length(); i++) {
            if(paran.charAt(i) == '('){
                balance.push(paran.charAt(i));
            }else if (paran.charAt(i) == ')'){
                balance.pop();
            }
        }



        if(balance.isEmpty()){
            System.out.println("La sentencia esta balanceada :)");
        }else{
            System.out.println("La sentencia no esta balanceada :(");
        }
    }
}
