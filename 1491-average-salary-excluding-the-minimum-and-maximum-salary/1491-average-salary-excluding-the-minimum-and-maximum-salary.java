class Solution {
    public double average(int[] salary) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: salary){
            list.add(ele);
        }
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size()-1);
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        double avg = (double)sum/list.size();
        return avg;
    }
}