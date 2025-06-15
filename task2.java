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
        
        System.out.println("Enter 5 integers");
        
        for(int x=0;x<arr.length-1;x++){
            for (int y=0; y<arr.length-1-x;y++){
                if (arr[x]>arr[x+1]){
                    int temp = arr[x];
                    arr[x]= arr[x+1];
                    arr[x+1]=temp;
                }
            }    
        }
        System.out.println("The sorted array is: ");
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("The second highest number is : "+arr[3]);
        System.out.println("The second lowest number is : "+arr[1]);

        scan.close();
    }
}

