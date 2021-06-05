import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Dizinin boyutu n : ");
        Scanner scanner=new Scanner(System.in);
        int boyut=scanner.nextInt();
        int gecici;
        int[] dizi=new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". eleman : ");
            dizi[i]=scanner.nextInt();
        }

        for(int i=0;i<boyut-1;i++){
            for(int j=i+1;j<boyut;j++){
                if(dizi[j]<dizi[i]){
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        System.out.print("\nSıralama : ");
        for(int a:dizi){
            System.out.print(a+" ");
        }
    }
}
