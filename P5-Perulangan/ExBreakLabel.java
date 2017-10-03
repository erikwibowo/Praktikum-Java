public class ExBreakLabel {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        int searchNum = 5;
        boolean foundNum = false;
        for (int i =0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(searchNum == numbers[i][j]){
                    foundNum = true;
                    break;
                }
            }
        }

        if(foundNum){
            System.out.println(searchNum+" found!");
        }else{
            System.out.println(searchNum+" not found!");
        }
    }
}