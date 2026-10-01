// public class pyramid {
//     public static void  main(String[]  arg){
//      int n= 5;
//      for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=i*2-1;k++){
//           System.out.print("* ");
//         }
//         System.out.println();
//      }

//     }
// }

    //   4s  *1
    //   3s * * *3
    //  2s * * * * *5
    //  1s* * * * * * *7
    // * * * * * * * * *9
    public class pyramid {
        public static void main(String[] arg){
            int n =5;
        //   for(int i=1;i<=n;i++){
        //    for(int j=1;j<n-i;j++){
        //     System.out.print(" ");
        //    }
        //    for(int k=0;k<2*i-1;k++){
        //     System.out.print("* ");
        //    }
        //    System.out.println();
        //   }



        for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
           }
           System.out.println();
        }

        }
        }