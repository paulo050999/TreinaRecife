 // Comando "dir" no cmd mostra os arquivos da pasta
 // Comando "javac aula.java" no cmd executa o arquivo
 // Comando "java aula param1 param2 param3" executa os 3 parâmetros
 // Comando "jar --version" verifica o exectavel jar
 // Comando "echo %PATH%" cria um arquivo jar
 // Metodo tem retorno e função não    
    
    public class aula {
        public static void main(String []args) {
            for(int i= 0; i<=args.length -1; i++){
            System.out.println(args[i]);
        }
    }
}