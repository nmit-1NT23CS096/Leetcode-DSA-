class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // fS -- fullSatisfied
        int fS =0;
        int i;
        int n=grumpy.length;
        for(i=0;i<n;i++){
            if(grumpy[i]==0){
                fS += customers[i];
            }
        }
        // eS-- extraSatisfied using secret technique
        int eS =0;
        for(i=0;i<minutes;i++){
            if(grumpy[i]==1){
                eS += customers[i];
            }
        }
        int mxS = eS;
        for(i=minutes;i<n;i++){
            if(grumpy[i]==1){
                eS += customers[i];
            }if(grumpy[i-minutes]==1){
                eS -= customers[i-minutes] ;
            }
            mxS = Math.max(eS,mxS);
        }
        return mxS+fS;
    }
}