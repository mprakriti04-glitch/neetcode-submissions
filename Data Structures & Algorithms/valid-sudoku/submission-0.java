class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        for(int row=0;row<n;row++){
            Set<Character> seen= new HashSet<>();
            for(int col=0;col<n;col++){
                char num= board[row] [col];
                if(num =='.'){
                    continue;
                }
                if(seen.contains(num)){
                    return false;
                }
                seen.add(num);
            }
        }
        for(int col=0;col<n;col++){
            Set<Character> seen= new HashSet<>();
            for(int row=0;row<n;row++){
                char num= board[row] [col];
                if(num =='.'){
                    continue;
                }
                if(seen.contains(num)){
                    return false;
                }
                seen.add(num);
            }
        }
        for(int startRow=0;startRow<n;startRow+=3){
            for(int startCol=0;startCol<n;startCol+=3){
                Set<Character> seen= new HashSet<>();
                for(int row=startRow;row<startRow+3;row++){
                    for(int col=startCol;col<startCol+3;col++){
                        char num= board[row] [col];
                        if(num =='.'){
                            continue;
                        }
                        if(seen.contains(num)){
                            return false;
                        }
                        seen.add(num);
                    }
                }
            }
        }
        return true;
    }
}
