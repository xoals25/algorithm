class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int i = 1; i <= T; i++){
            int[] intList = new int[10];
            for(int j = 0; j<10; j++){
                intList[j] = sc.nextInt();
            }
            Arrays.sort(intList);
            System.out.println("#"+i+" "+intList[intList.length-1]);
        }
    }
}