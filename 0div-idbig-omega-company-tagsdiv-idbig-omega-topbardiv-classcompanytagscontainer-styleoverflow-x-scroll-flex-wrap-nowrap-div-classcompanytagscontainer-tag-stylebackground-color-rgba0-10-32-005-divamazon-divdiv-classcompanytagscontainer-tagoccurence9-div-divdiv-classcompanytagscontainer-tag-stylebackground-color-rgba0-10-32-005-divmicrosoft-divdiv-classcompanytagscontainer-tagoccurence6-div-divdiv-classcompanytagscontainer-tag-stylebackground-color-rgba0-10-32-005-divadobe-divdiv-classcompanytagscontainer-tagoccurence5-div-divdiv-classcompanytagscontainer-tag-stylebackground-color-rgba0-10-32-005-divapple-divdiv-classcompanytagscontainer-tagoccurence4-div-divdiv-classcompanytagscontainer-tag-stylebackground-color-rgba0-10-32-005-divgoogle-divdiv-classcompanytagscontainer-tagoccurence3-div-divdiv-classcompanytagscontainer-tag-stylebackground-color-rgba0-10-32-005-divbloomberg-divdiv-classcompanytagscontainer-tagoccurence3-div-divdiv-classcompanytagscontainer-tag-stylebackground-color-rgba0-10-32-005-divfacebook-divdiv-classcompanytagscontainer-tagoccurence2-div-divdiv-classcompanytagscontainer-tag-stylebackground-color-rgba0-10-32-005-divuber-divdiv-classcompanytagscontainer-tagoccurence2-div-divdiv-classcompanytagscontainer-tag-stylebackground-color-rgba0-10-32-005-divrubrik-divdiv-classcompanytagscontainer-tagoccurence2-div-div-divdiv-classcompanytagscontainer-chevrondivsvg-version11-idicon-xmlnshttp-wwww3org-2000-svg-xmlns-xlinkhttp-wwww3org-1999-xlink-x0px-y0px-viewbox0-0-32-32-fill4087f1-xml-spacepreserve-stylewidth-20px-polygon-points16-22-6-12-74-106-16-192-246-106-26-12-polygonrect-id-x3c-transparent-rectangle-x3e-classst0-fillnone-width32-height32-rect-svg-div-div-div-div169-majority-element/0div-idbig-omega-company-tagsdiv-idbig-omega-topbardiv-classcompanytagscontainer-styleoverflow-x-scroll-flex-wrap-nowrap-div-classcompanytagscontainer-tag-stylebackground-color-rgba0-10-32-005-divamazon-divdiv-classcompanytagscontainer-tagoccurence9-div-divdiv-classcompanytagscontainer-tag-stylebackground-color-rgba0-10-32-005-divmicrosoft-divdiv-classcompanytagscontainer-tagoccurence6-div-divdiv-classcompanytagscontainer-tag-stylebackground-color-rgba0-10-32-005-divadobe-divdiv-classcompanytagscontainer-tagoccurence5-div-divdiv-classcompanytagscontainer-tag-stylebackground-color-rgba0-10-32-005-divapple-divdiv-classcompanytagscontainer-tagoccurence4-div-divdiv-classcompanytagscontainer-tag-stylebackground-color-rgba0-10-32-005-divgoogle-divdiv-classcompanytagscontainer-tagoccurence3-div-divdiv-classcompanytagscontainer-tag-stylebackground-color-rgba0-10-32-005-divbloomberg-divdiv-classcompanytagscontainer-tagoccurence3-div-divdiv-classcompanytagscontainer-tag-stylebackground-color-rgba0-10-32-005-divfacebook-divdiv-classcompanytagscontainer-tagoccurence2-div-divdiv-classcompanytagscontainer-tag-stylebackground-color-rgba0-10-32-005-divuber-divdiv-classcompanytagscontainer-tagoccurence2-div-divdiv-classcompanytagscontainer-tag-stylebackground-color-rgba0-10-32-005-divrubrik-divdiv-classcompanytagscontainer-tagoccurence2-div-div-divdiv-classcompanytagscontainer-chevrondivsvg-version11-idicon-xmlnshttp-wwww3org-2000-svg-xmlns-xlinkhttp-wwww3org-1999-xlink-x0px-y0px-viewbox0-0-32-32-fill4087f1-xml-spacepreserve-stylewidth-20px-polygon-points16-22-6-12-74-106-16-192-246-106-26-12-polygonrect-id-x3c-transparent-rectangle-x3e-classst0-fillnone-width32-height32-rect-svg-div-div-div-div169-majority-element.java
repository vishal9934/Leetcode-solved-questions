// class Solution {
//     public int majorityElement(int[] arr) {
//             int n=arr.length;
//             int ans=0;
            
//             HashMap<Integer,Integer> mp=new HashMap<>();
//             for(int i=0;i<n;i++){
//                     mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//                    if(mp.get(arr[i])>n/2)
//                          ans=arr[i];
//             }
//             return ans;
//     }
// }



// moore's voting algorithm
// T.C=O(n),S.C=O(1)
class Solution {
    public int majorityElement(int[] arr) {
            int count=0;
            int majority=0;
            for(int element:arr){
                if(count==0){
                    majority=element;
                }
                 if(element==majority){
                    count++;
                }
                else{
                    count--;
                }
            }
            return majority;
    }
}