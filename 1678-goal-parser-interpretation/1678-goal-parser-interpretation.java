class Solution {
    public String interpret(String command) {
        String goal="";
      
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                goal=goal+"G";
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                goal=goal+"o";
                  i++;
            }
            else{
                goal=goal+"al";
                i+=3;
            }
        }
        return goal;
    }
}