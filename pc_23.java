public class pc_23 {
    public static void main(String[] args) {
        int n=5;
        int m=4;
        for(int i=0;i<n;i++){
            for (int j=1; j<=m; j++){
                if(i== 1|| j==1 || i==n||j==m){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
        }
    }
}
