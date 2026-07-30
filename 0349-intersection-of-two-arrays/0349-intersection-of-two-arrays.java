class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();

        for(int n1 : nums1) {
            set.add(n1);
        }

        List<Integer> list = new ArrayList();

        for(int n2 : nums2) {
            if(set.contains(n2)) {
                list.add(n2);
                set.remove(n2);
            }
        }

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}