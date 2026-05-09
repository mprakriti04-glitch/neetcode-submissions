class Solution {

    public String encode(List<String> strs) {
 StringBuilder sb = new StringBuilder();

        for(String s : strs){

            sb.append(s.length());
            sb.append("#");
            sb.append(s);

        }

        return sb.toString();
    }



    public List<String> decode(String str) {
 List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()){

            int j = i;

            // Find the '#'
            while(str.charAt(j) != '#'){
                j++;
            }

            // Length of current word
            int length = Integer.parseInt(str.substring(i, j));

            i=j+1;

            // Extract the word
            result.add(str.substring(i, i + length));

    

            // Move to next encoded word
            i+=length;
        }

        return result;
    }
}
