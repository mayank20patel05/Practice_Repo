package demo;

public class TrappedWater {

    public static void main(String[] args) {
        //int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int[] height = {4,2,0,3,2,5};
        int difference;
        int diff;

        int trappedWater = 0;
        for (int i = 1; i < height.length-2 ; i++) {

            difference = Math.abs(height[i+1] - height[i-1]);


            if(difference == 0){
                diff = height[i+1] - height[i];
                if (diff > 0){
                    trappedWater += diff;
                }
                int di = 0;

                try {
                    di = Math.abs(height[i-2] - height[i+2]);
                }catch(Exception exception){

                }
                if (di > 0){
                    if(Math.min(height[i-2],height[i+2]) > height[i-1]){
                        trappedWater += (3*(Math.min(height[i-2],height[i+2]) - height[i-1]));
                    }
                }
            }
            if(difference > 0){
                trappedWater += (difference-height[i]);
            }

        }
        System.out.println(trappedWater);

    }
}
