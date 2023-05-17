public class Deletrar {
    public static void main(String[] args) {
        for(String str : args){
            int i = 0;
            for( ; i < str.length()-1; i++){
                System.out.print(str.charAt(i)+"-");
                }
                System.out.println(str.charAt(i));
            }          
           
        }
    }