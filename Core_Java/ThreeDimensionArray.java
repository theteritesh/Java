public class ThreeDimensionArray{
    public static void main(String[] args) {
        int nums[][][]=new int[3][4][5];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    nums[i][j][k]=(int)(Math.random() * 10);
                }    
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    System.out.print(nums[i][j][k]+" ");
                }    
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}