import java.util.Scanner;
public class heightCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] friends = {"Amar","Akbar","Anthony"};
        
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            height[i] = sc.nextInt();
        }
        int minAge = 0;
        for(int i=0;i<3;i++){
            if(age[i]<age[minAge]){
                minAge = i;
            }
        }
        int maxHeight = 0;
        for(int i=0;i<3;i++){
            if(height[i]>height[maxHeight]){
                maxHeight = i;
            }
        }
        System.out.println("The youngest is "+age[minAge]+" with age "+age[minAge]+".");
        System.out.println("The youngest is "+height[maxHeight]+" with age "+height[maxHeight]+".");
     }    
}
