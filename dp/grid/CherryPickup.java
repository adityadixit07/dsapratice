public class CherryPickup {
    public static void main(String[] args) {
        int[][] choco={{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        System.out.println(maxchoco_recursive(0, 0, 0, choco));
    }
    // there are two person alice and bob alice start from the topleft and bob start from topright
    // if alice pickup that choco and bob also pickup same choco then only it value count 1
    // and both can move left,right,down and then can end at any col of the last row
    // we have to find the maximum chocolate that they both pickup

    // recursive approach
    public static int maxchoco_recursive(int i,int j1,int j2,int[][]choco){
        if(j1<0|| j1>=choco[0].length || j2<0 ||j2>=choco[0].length){
            return -(int)Math.pow(10, 9);
        }
        if(i==choco.length-1){
            // if both pickup same choco
            if(j1==j2){
                return choco[i][j1];
            }
            // if they pickup different
            else{
                return choco[i][j1]+choco[i][j2];
            }
        }

        // now we expole all paths actually there are totol 9conditions possible
        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                // if they pickup same then we consider it one only
                int val=0;
                if(j1==j2){
                    val=choco[i][j1];
                }
                // if both will pickup the different choco
                else{
                    val=choco[i][j1]+choco[i][j2];
                }
                val+=maxchoco_recursive(i+1, j1+dj1, j2+dj2, choco);
                maxi=Math.max(maxi, val);
            }
        }
        return maxi;
    }
}
