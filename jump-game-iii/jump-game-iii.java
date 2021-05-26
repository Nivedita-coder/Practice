class Solution {
    public boolean canReach(int[] arr, int start) {
       Queue<Integer> qu = new LinkedList<>();
        qu.add(start);

        while (qu.size() > 0) {
            int size = qu.size();

            while (size-- > 0) {
                int point = qu.remove();

                //either move to left point - arr[point]
                if (point - arr[point] >= 0) {
                    if (arr[point - arr[point]] == 0) {
                            return true;
                        } else if (arr[point - arr[point]] > 0) {
                            qu.add(point - arr[point]);
                        }
                    }

                    //either move to right point+arr[point]
                    if (point + arr[point] < arr.length) {
                        if (arr[point + arr[point]] == 0) {
                                return true;
                            } else if (arr[point + arr[point]] > 0) {
                                qu.add(point + arr[point]);
                            }
                        }

                        arr[point] = -1;
                    }
                }
                return false; 
        
    }
}