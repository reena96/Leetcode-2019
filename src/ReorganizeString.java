public class ReorganizeString {
    public static String reorganizeString(String S) {
        char[] str = S.toCharArray();
        int j,k;
        char temp;
        for(int i = 0; i< str.length ; i++){
            j=i+1;
            if(j<str.length && str[i] == str[j]){
                k = j+1;
                while(k<str.length && str[j] == str[k]){
                    k++;
                }

                if(k < str.length) {
                    temp = str[j];
                    str[j] = str[k];
                    str[k] = temp;
                }
            }
        }
        for( int i = str.length-1; i>=0;i--){
            j=i-1;
            if(j>=0 && str[i] == str[j]){
                k = j-1;
                while(k>=0 && str[j] == str[k]){
                    k--;
                }

                if(k < 0) return "";
                if(k >= 0) {
                    temp = str[j];
                    str[j] = str[k];
                    str[k] = temp;
                }
            }

        }

        return new String(str);
    }

    public static void main(String[] args){
        System.out.println(reorganizeString("aaabbbcccc"));
    }
}