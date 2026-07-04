class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
        ArrayList <Integer> arr= new ArrayList<>(); 
        while(i < nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[arr.size()];
        for(int s= 0;s<arr.size();s++){
            ans[s] = arr.get(s);
        }
        return ans;
    }
}