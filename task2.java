import java.util.*;

class task2{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scan =new Scanner(System.in);

        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The numbers you entered are: ");
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        
    }
}

