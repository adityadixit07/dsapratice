public class CopySetBitsinRange {
    public static void main(String[] args) {
        int x=16;
        int y=4;
        int l=2;
        int r=5;
        System.out.println(copysetbits(x, y, l, r));
    }
    public static int copysetbits(int x,int y,int l,int r){
        int mask=(1<<(r-l+1));
        mask--;
        mask=(mask<<(l-1));
        mask=mask&y;
        return mask|x;
    }
}