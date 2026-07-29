class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) result.add("FizzBuzz");

            else if(arr[i] % 3 == 0) result.add("Fizz");

            else if(arr[i] % 5 == 0) result.add("Buzz");

            else result.add(i+1 + "");
        }

        return result;
    }
}