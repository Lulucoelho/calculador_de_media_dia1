public class ExemplosBasicos{
    public static void main(String[] args) {
       //indent  (indetação)
       //for, while e do/while
       //repetição controlada por computador
      // int cont = 4;
      // while(cont <= 3){
       //     System.out.println(cont);
       //     cont = cont + 1;
      //  }

      // for ( int cont = 1; cont <= 2; cont = cont + 1){
       //     System.out.println(cont);
        //}

      int cont = 4;
      do{
        System.out.printf("Valor da Vez: %d\n",cont);
        cont += 1; //cont = cont + 1;
        }while(cont <= 3);
    }
}