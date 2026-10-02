class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder[] row=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int cr=0;
        boolean g=false;
        for(char chrr:s.toCharArray()){
            row[cr].append(chrr);
            if(cr==0 || cr==numRows-1){
                g=!g;
            }
            cr+=g?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder rows:row){
            result.append(rows);
        }
        return result.toString();
    }
}