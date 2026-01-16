public class GFG_Equilibrium_Point {
        public static int findEquilibrium(int arr[]) {
            // code here
            int n = arr.length;
            int ans = -1;

            int prefix [] = new int[n];
            int suffix[] = new int[n];

            prefix[0] = arr[0];
            for(int i = 1; i < n -1; i++){
                prefix[i] = prefix[i-1] + arr[i];
            }

            suffix[n - 1] = arr[n-1];
            for(int i = n - 2; i >= 0; i--){
                suffix[i] = suffix[i + 1] + arr[i];
            }
            for(int i = 0; i < n; i++){
                if(prefix[i] == suffix[i]){
                    ans = i;
                    break;
                }
            }
            return ans;
        }

    public static void main(String[] args) {

    }
}


