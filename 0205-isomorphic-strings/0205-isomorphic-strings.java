class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] sT=new int [256];
        int [] tS=new int [256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(sT[a]!=0&&sT[a]!=b){
                return false;
            }
             if(tS[b]!=0&&tS[b]!=a){
                return false;
            }
            sT[a]=b;
            tS[b]=a;
        }
        return true;
    }
}