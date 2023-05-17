public class palindromo {
    public static void main(String[] args) {
        String concat = "";
        //Para facilidad en el algortimo, se guardan todas las palabras
        //en un solo string, omitiendo asi los "espacios" de la frase
        for(String str : args){
            concat += str.toLowerCase(); //se ignoran las mayusculas
        }
        int len = concat.length();
        boolean esPalindromo = true;
        for(int i = 0; esPalindromo && i < concat.length()/2; i++){
            if(concat.charAt(i)!=concat.charAt(len-i-1)){
                esPalindromo = false;
            }
        }
        if(esPalindromo){
            System.out.println("ES PALINDROMO");
        }
        else{
            System.out.println("NO ES PALINDROMO");
        }
    }
}
